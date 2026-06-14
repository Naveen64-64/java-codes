/* encapsulation it is used access the private variables and method 
by useing getter and setter method*/
class Demo{
    private int age;
    public int getage(){
        return age;
    }
    public void setage(int age){
        this.age=age;
    }
}
public class Encapsulation{
    public static void main(String arg[]){
        Demo d1 = new Demo();
        d1.setage(12);
        d1.setage(16);
        System.out.println("age: "+d1.getage());

    }
}