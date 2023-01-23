package food;

public interface whenAlways {
  void when();
  void what();
  void yookaan();
}
interface Fish
{
  void eat();  
  
}
interface Read extends Fish
{
 void refer();
}

abstract class Veg implements whenAlways, Read
  {
    public void when()
     {
      System.out.println("In the morning, afternoon and evening");
     }
  }
class Pro extends Veg
 {
     public void what()
    {
      System.out.println("Vegetables, Protiens  and Fats respectively");
     }
     public void yookaan()
     {
     System.out.println("Drink a glass of water");
     }
     public void eat()
     {
    System.out.println("It should be good for you to eat some fish");
     }
     
    public void refer()
   {
     System.out.println();
     System.out.println("11111111111111");
    System.out.println("read books for more");
    }
    public void r()
    {
    System.out.println();
   System.out.println("Don forget to share");
    }
 }
 