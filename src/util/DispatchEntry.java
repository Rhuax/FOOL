package util;

import ast.VardecNode;

import java.util.ArrayList;

/**
 * Created by crow on 01/07/17.
 */
public class DispatchEntry {
    public String getClassName() {
        return className;
    }

    public DispatchMethodTable getDispatchMethodTable() {
        return dispatchMethodTable;
    }

    String className;
    DispatchMethodTable dispatchMethodTable;
    ArrayList<VardecNode> attributes;

}