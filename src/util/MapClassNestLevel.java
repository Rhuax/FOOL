package util;

import ast.ClassNode;

import java.util.HashMap;

/**
 * Created by crow on 23/06/17.
 */
public class MapClassNestLevel {
    static private HashMap<String, Integer> map = new HashMap<>();
    static private ClassNode currentAnalyzedClass;

    public static int getMaxClassNestLevel() {
        return maxClassNestLevel;
    }

    static private int maxClassNestLevel = 0;

    public static ClassNode getCurrentAnalyzedClass() {
        return currentAnalyzedClass;
    }

    public static void setCurrentAnalyzedClass(ClassNode currentAnalyzedClass) {
        MapClassNestLevel.currentAnalyzedClass = currentAnalyzedClass;
    }


    public static int getNestingLevelFromClass(String s) {
        Integer i = map.get(s);
        return i != null ? i : -1;

    }

    public static void putClassNestingLevel(String c, int nest) {
        if (nest > maxClassNestLevel)
            maxClassNestLevel = nest;
        map.put(c, nest);
    }

}
