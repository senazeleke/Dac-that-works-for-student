package main1;

import java.util.ArrayList;
import main1.AboutGenClass;
import main1.dealMethod;


public class Main1 {

  public static void main(String[] args) {

    // initialize generic class with string data
AboutGenClass<String> intObj = new   AboutGenClass<String>("Joey");
 System.out.println("Generic Class returns: " + intObj.getData());

 
 
   //initialize the class with Integer data
   dealMethod deal= new dealMethod();
    // generics method working with String
  deal.<String>displayMethod("Java lab class");
   
  
  
  //collection framework
   System.out.println();
  ArrayList<String> sport= new ArrayList<>();
        sport.add("Football");
        sport.add("Running");
        sport.add("Racing");
   System.out.println("ArrayList_sports" + sport);
               
        
        
    } 
  }


