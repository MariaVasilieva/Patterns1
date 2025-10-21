package org.example.composite;

public class File implements FileSystemComponent{
    private String name;
    public File(String name) {
        this.name = name;
    }

    @Override
    public void open() {
        System.out.println("Opening " + name);
    }
}
