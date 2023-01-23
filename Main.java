package exercise;

public class Main {
   public static void main(String[] args)     {
   // Exercise Ex=new Exercise();
     Physics p=new Physics();
    //to call a function that works for 
    //isSatcked from parent exercise;
      int u= p.isStacked();
  System.out.println("2. validation=" +u);  
      p.mathsExercise(5,8,6,3,4);
      p.Accelaration();
      p.Tobeoverriden();
     
     
}
}


