package exercise;

public class Exercise{
//protected name;
public void mathsExercise(int ...n)
    {
      System.out.println("3.multiply varargs");
        int mul=1; 
       //for(int i=1;i<n.length;i++)
       for(int i: n)    
        {
           mul=mul*i;
        }
       System.out.println("the multiplication of the numbers is=" +mul);
    }
public  int isStacked()
   {
     int n=6;
     System.out.println("1.isStack is back  check for the summation of whole number in series");
  int i,sum=0;
  for(i=1;i<n;i++)
     {
       { sum+=i;
       if(sum==n)
         return 1;
         }
     
     }
    
  return 0;
    }
 
 void Tobeoverriden()
 {
   System.out.println("6.I am in the super class Exercise you have used super key to find me");
 }
 }
class Physics extends Exercise
{
  void Accelaration()
  {
    double v=26.5,t=2.395;
    double a=v/t;
    System.out.println("4.Accelaration in physics class is="  +a);
  }
  
   void Tobeoverriden()
  {
    System.out.println("5.This method does works for Physics class it overrides the the parent class");
    System.out.println("Prefer Physics to maths");
      super.Tobeoverriden();
  }
}



