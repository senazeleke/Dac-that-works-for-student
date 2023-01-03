import java.util.Scanner;
public class Main {

        String name;
        int id;
        double salary;

        Main(){
            this.name="null";
            this.id=0;
            this.salary=0.0;}
    Main(String name, int id, double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    int Sumof(String c, int... n){
        int sum=0;
        for(int i=0;i<n.length;i++){
            sum=sum+n[0];

        } return sum;
    }
    static void cari(String... name)
    {
        for(int i=0;i<name.length;i++)
            System.out.println(name[i]);
    }
    void display(){
        System.out.println("name is " +name);
        System.out.println("id is " +id);
        System.out.println("salary is " +salary);

    }
    public static void main(String[] args) {
        Main d1=new Main();
        Main d2=new Main("Bond", 7, 162721);
        Main d3=new Main();

        int r1=d3.Sumof("iii", 65,6,4,33,58,474,646,4);
        System.out.println("r1:" +r1);
        int r2=d3.Sumof("me", 65,6,4,33,58);
        System.out.println("r2:" +r2);
        int r3=d3.Sumof("you", 65,6,4,88,4);
        System.out.println("r3:" +r3);
        d1.display();
        d2.display();
        cari("i", "am", "going", "out", "for a walk");
        Scanner c= new Scanner(System.in);
        int a, b;
        System.out.print("Enter the first number");
        System.out.println();
        a=c.nextInt();
        System.out.print("Enter the second number");
        System.out.println();
        b=c.nextInt();
        int  sum=a+b;
        System.out.printf("the sum is	%s%n", +sum);
    }
}