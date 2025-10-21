package org.example.flyweight;

import java.util.ArrayList;

public class Forest {
    private ArrayList<Tree> trees = new ArrayList<>();
    public void addTree(int x, int y, String color, String name, String texture) {
        TreeType type = TreeFactory.getTreeType(name, color, texture);
        Tree tree = new Tree(x,y, type);
        trees.add(tree);
    }
    public void draw(){
        for (Tree tree : trees) {
            tree.draw();
        }
    }
}
