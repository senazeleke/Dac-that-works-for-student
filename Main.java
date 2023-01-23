package loops;

import java.util.ArrayList;
import java.util.Iterator;




public class Main {
         
         
 public static void main(String[] args) {
   
    lab: {
         for (int i = 1; i <= 5; ++i)
           { 
             if (i == 4)
                {
                   break lab;
                } 
                  System.out.println(i);
                 } 
        System.out.println("hi there");
       }System.out.println("hi there");
       
       
     Many m1=new Many();
  System.out.println("m1 values");
System.out.println("height:" +m1.height);
 System.out.println("width:" +m1.width);
 
 System.out.println("Area:" +m1.calArea(m1.height,m1.width));
  
     Many m2=new Many(5,6);
     
     System.out.println("m2 values:");
System.out.println("height:" +m2.height);
 System.out.println("width:" +m2.width); 
  System.out.println("Area:" +m2.calArea(m2.height,m2.width));
  
  
  ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
     System.out.println("ArrayList:" + num);

  // Creating an instance of Iterator
   Iterator<Integer> iterate = num.iterator();

        int n = iterate.next();
        System.out.println("Accessed Element: " + n);

        iterate.remove();
        System.out.println("Removed Element: " + n);

        System.out.print("Updated ArrayList: " +num);

}
}