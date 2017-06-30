package util;

import ast.ClassNode;
import ast.FunNode;
import ast.VardecNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/**
 * Created by crow on 30/06/17.
 */
public  class DispatchTable {



public static int getDispatchIndexFromClassName(String className)
{
    boolean found=false;
    int i=0;
    while(!found){
        if(Objects.equals(dispatchTable.get(i).className,className)){
            found=true;
        }
        else
            i++;
    }
    return i;
}
static ArrayList<DispatchEntry> dispatchTable=new ArrayList<>();


public static void buildDispatchTable(ArrayList<ClassNode> classList){
    for(ClassNode classdec:classList){
        ArrayList<VardecNode> current_attributes=new ArrayList<>();
        ClassNode extClass =classdec.getExtendedClass();
        if(extClass!=null)
            current_attributes.addAll(extClass.getAttributeList());

        current_attributes.addAll(classdec.getAttributeList());
        DispatchEntry entry=new DispatchEntry();
        entry.attributes=current_attributes;

        DispatchMethodTable dmt=new DispatchMethodTable();

        if(extClass!=null){
            for(FunNode method:extClass.getMethodList())
                dmt.methodList.put(method.getId(),0);
        }
        for(FunNode method:classdec.getMethodList())
            dmt.methodList.put(method.getId(),0);

        entry.dispatchMethodTable=dmt;
        entry.className=classdec.getId();
        dispatchTable.add(entry);



    }


}

}


class DispatchEntry{
    String className;
    DispatchMethodTable dispatchMethodTable;
    ArrayList<VardecNode> attributes;

}