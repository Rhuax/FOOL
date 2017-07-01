package util;

import ast.ClassNode;
import ast.FunNode;
import ast.VardecNode;
import lib.FOOLlib;

import java.util.ArrayList;
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
    public static ArrayList<DispatchEntry> dispatchTable=new ArrayList<>();


    public static void buildDispatchTable(ArrayList<ClassNode> classList)
    {
        if(classList != null)
        {
            for(ClassNode classdec:classList){
                ArrayList<VardecNode> current_attributes=new ArrayList<>();
                ClassNode extClass =classdec.getExtendedClass();
                if(extClass!=null)
                    current_attributes.addAll(extClass.getAttributeList());

                current_attributes.addAll(classdec.getAttributeList());
                DispatchEntry entry=new DispatchEntry();
                entry.attributes=current_attributes;

                DispatchMethodTable dmt=new DispatchMethodTable();

                if(extClass!=null)
                {
                    for(FunNode method:extClass.getMethodList())
                    {
                        DispatchEntry dEntry = dispatchTable.get(getDispatchIndexFromClassName(extClass.getId()));
                        dmt.methodList.put(method.getId(), dEntry.getDispatchMethodTable().methodList.get(method.getId()));
                    }

                }

                for(FunNode method:classdec.getMethodList())
                    dmt.methodList.put(method.getId(), FOOLlib.freshFunLabel());



                entry.dispatchMethodTable=dmt;
                entry.className=classdec.getId();
                dispatchTable.add(entry);
            }
        }
    }
}


