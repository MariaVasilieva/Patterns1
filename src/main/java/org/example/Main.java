package org.example;


import org.example.builder.Document;

public class Main {
    public static void main(String[] args) {
        Document document = new Document.Builder()
                .setTitle("Harry Potter")
                .setAuthor("Joan Rowling")
                .setContent("chapter1 ...")
                .setDate("4/11/2025")
                .setPublic(true)
                .build();
        System.out.println(document.toString());
    }
}