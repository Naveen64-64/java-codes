/*
polymorphism it was two types 

1.overloading
2.overideing

*/
class Mom{
    public void display(){
        System.out.println("naveen kumar "); // noramal method  
    }
    public void display(int a){
        System.out.println("over loaded by int a: " + a ); // overloaded method
    }
}
class Dad extends Mom{
    public void display(){
        System.out.println("naveen kumar dasari "); // overrided method
    }
}
public class Polymorphism{
    public static void main(String arg[]){
        Dad b = new Dad();
        b.display();
        b.display(12);

    }
}