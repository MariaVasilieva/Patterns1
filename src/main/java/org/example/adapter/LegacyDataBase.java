package org.example.adapter;

public class LegacyDataBase {
    public void initialize() {
        System.out.println("Initializing legacy database...");
    }
    public void destroy() {
        System.out.println("Destroying legacy database...");
    }
    public void makeQuery(String query) {
        System.out.println("Making query: " + query);
    }
    public void executeQuery(String query) {
        System.out.println("Executing query: " + query);
    }
}
