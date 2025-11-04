package org.example;

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
}
