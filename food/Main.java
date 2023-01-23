package food;


 public class Main {

   public static void main(String[] args)   {
    Food V=new Vegetables();
       V.onAdiet();
         V.content();
              V.example();
    
    Food P=new Protiens();
         P.content();
              P.example();
              
   Food F=new Fats();
         F.content();
              F.example();
    System.out.println();
    System.out.println();
   //whenAlways Al=new Pro(); Is also possible
    Veg Al=new Pro();
        Al.when();
        Al.what();
        Al.yookaan();
        Al.eat();
        Al.refer();
  }
}
