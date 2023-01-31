package collinterfac;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;
import java.util.TreeSet;


public class collinterfac {

  public static void main(String[] args) {
   ArrayList<Integer> A=new ArrayList<Integer>();
   //or   LinkedList<Integer> A=new LinkedList<Integer>();
  
  //*^€™]>{>¥^  Arraylist and linled list
   for(int i=0; i<4;i++)
        A.add(i);
        System.out.println(A);
        
        A.remove(2);       
        System.out.println(A);
   //print one by one
   for(int i=0;i<A.size();i++)         
   System.out.print(A.get(i) +" ");
   
 System.out.println();
 //^€×°^]^¡%^Using Stack and Iterator;   
   Stack<String> S=new Stack<String>();
   S.push("from");
   S.push("the ashes");
   S.push("we will");
   S.push("rise");
   S.push("yeah!");
   Iterator<String> Itr=S.iterator();{}
   while(Itr.hasNext())
     System.out.print(Itr.next() +" ");
     
     System.out.println();       
     S.pop();
    Itr=S.iterator();
      while(Itr.hasNext())
      System.out.print(Itr.next() +" ");
 
 //  Hashset using    
 HashSet<String> SH=new HashSet<String>();
  SH.add("we");
  SH.add("are");
  SH.add("who");
  SH.add("we");
  SH.add("were");
  System.out.println();
  System.out.print("HASHSET");
  System.out.println();
  Iterator<String> it=SH.iterator();
 while(it.hasNext())
  System.out.println(it.next());
  
  //LinkedHashSet  
  LinkedHashSet<String> LSH=new LinkedHashSet<String>();
  LSH.add("we");
  LSH.add("are");
  LSH.add("who");
  LSH.add("we");
  LSH.add("were");
  System.out.println();
  System.out.print("LinkedHASHSET");
  System.out.println();
  Iterator<String> i=LSH.iterator();
 while(i.hasNext())
  System.out.println(i.next());

  
  //treeset
 TreeSet<String> t=new TreeSet<String>();
  t.add("we");
  t.add("are");
  t.add("who");
  t.add("we");
  t.add("were");
  System.out.println();
  System.out.print("TREESET");
  System.out.println();
  Iterator<String> tree=t.iterator();
 while(tree.hasNext())
  System.out.println(tree.next());
  
  //Map And Hashmap
  HashMap<Integer, String> Hm=new HashMap<Integer, String>();
  Hm.put(1, "Geeks");
  Hm.put(2, "for");
  Hm.put(3, "Geeks");
 System.out.println();    System.out.println("value at 1::" +Hm.get(1));
 System.out.println();
 for(Map.Entry<Integer, String> e: Hm.entrySet())
  System.out. println(e.getKey() +" " +e.getValue());
 
  }
}
