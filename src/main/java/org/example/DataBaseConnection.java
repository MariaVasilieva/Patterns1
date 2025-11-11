package org.example;

import org.example.prototype.Person;

public class DataBaseConnection {
    private static DataBaseConnection instance;
    private DataBaseConnection(){
        System.out.println("DataBaseConnection created");
    }

    public static DataBaseConnection getInstance(){
        if(instance == null){
            instance = new DataBaseConnection();
        }
        return instance;
    }
    public void makeQuery(String query){
        System.out.println("Query: " + query);
    }

    public static class Main {
        public static void main(String[] args) {
            Person person = new Person("Tom",12);
            System.out.println(person);
            Person person2 = person;
            Object object = new Object();
        }
    }
}
