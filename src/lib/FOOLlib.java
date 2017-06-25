package lib;

import ast.*;

import java.util.Objects;

public class FOOLlib {
  
  private static int labCount=0; 
  
  private static int funLabCount=0; 

  private static String funCode=""; 

  //valuta se il tipo "a" � <= al tipo "b", dove "a" e "b" sono tipi di base: int o bool
  public static boolean isSubtype (Node a, Node b)
  {
    boolean r = false;
    boolean found;

    if(a instanceof ClassNode && b instanceof ClassNode)
    {
      if(((ClassNode) a).getId().compareTo(((ClassNode) b).getId()) == 0)
      {
        r = true;
      }
      else
      {
        found = false;
        ClassNode inheritedClass = (((ClassNode) a).getExtendedClass());

        while(!found && inheritedClass != null)
        {
          if(((ClassNode) b).getId().compareTo(inheritedClass.getId()) == 0)
            found = true;

          inheritedClass = inheritedClass.getExtendedClass();
        }

        if(found)
          r = true;
      }
    }
    else
    {
      if (a instanceof IntTypeNode){
        if(b instanceof IntTypeNode || b instanceof FloatTypeNode)
          r=true;
      }
      else if (a instanceof FloatTypeNode && b instanceof FloatTypeNode)
        r=true;

    }

    return  r;
  }

  public static boolean isSupertype (Node a, Node b) {
    return a.getClass().equals(b.getClass()) ||
            ( (a instanceof FloatTypeNode) && (b instanceof IntTypeNode) ); //
  }
  
  public static String freshLabel() { 
	return "label"+(labCount++);
  } 

  public static String freshFunLabel() { 
	return "function"+(funLabCount++);
  } 
  
  public static void putCode(String c) { 
    funCode+="\n"+c; //aggiunge una linea vuota di separazione prima di funzione
  } 
  
  public static String getCode() { 
    return funCode;
  } 


}