package food;

public abstract class Food {
      Food()
      {
        System.out.println("Food is ready");
      }
      abstract void content();
      abstract void example();
      void onAdiet()
      {
      System.out.println("If your on a diet check for the content");
      }
}

 class Vegetables extends Food
{
     void content()
       {
        System.out.println("11.I provide you with minerals and vitamims");
       }
    void example()
       {
      System.out.println("banana, carrot, pepper, mango and etc");
       }
}
 class Protiens extends Food
{
    void content()
      {
        System.out.println("22.I provide you with fibre,minerals and vitamims and low fat");
      }
       void example()
       {
      System.out.println("beans,peanuts, meat, fish and etc");
       }
}
   class Fats extends Food
{
     void content()
      {
        System.out.println("33.I provide you with fibre,calcium,Iron and high fat");
      }
       void example()
       {
     System.out.println("oils, meat, milk and etc");
       }
}
