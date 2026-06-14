/*Abstraction is one of the keyword used for write the 
complete and incomplete methods in a class by useing keyword "Abstraction" */
abstract class Naveen{
    public void tenth(){
        System.out.println("thenth cgp 7.1");
    }
    public void inter(){
        System.out.println("inter cgp 6.71");
    }
    public abstract void btech();
}
class Kumar extends Naveen{
    public void btech(){
        System.out.println("it was not completing it was gioing on now");
    }
}
public class Abstraction {
    public static void main(String arg[]){
        Kumar study = new Kumar();
        study.btech();
        
    }
}
