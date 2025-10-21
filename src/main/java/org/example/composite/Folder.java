package org.example.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponent{
    private String name;
    private List<FileSystemComponent> components;
    public Folder(String name) {
        this.name = name;
        this.components = new ArrayList<>();
    }

    @Override
    public void open() {
        System.out.println("Opening folder " + name);
        for (FileSystemComponent component : components) {
            component.open();
        }
    }
    public void add(FileSystemComponent component) {
        components.add(component);
    }
    public void remove(FileSystemComponent component) {
        components.remove(component);
    }
}
