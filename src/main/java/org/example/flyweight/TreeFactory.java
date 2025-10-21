package org.example.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private static final Map<String, TreeType> map = new HashMap<>();
    public static TreeType getTreeType(String name, String color, String texture) {
        String key = name+" " + color+" " + texture;
        TreeType treeType = map.get(key);
        if (treeType == null) {
            treeType = new TreeType(name, color, texture);
            map.put(key, treeType);
        }
        return treeType;
    }
}
