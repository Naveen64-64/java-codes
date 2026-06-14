import java.util.Scanner;
/* 
Inheritance is nothing but the importing parent class properties to 
child class by useing "extends" keyword.

=> single inheritance 
=>multti level inheritance
=>hirarical inheritance

*/
class A{
    int a;
    int b;        //parent class
    public void add(){
        System.out.println(a+b);
    }
}
class B extends A{  //child class of A "single inheritance"
    public void sub(){
        System.out.println(a-b);
    }
}
class C extends B{  //sub child class of B "multilevel inheritance"
    public void mul(){
        System.out.println(a*b);
    }
}
class D extends A{  // child class of A "hyrarical inheritance"
    public void div(){
        if(b>0){
            System.out.println(a/b);
        }
        else
            System.out.println("not posible to divide with zero");

    }
}
public class Inheritance {
    public static void main(String arg[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("enter your number for a");
        int a = scn.nextInt();
        System.out.println("enter your number for b");
        int b = scn.nextInt();
        System.out.println("1.addition");
        System.out.println("2.subtraction");
        System.out.println("3.multiplication");
        System.out.println("4.divison");
        System.out.println("select one from the above");
        int f = scn.nextInt();
        C c = new C();
        c.a=a;
        c.b=b;
        D d = new D();
        d.a=a;
        d.b=b;
        if(f == 1){
            c.add();
        }
        else if(f == 2){
            c.sub();
        }
        else if(f == 3){
            c.mul();
        }
        else if(f == 4){
            d.div();
        }
        else{
            System.out.println("invalid option selected");
        }
    }
}