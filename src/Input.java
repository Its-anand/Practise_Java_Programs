/*
Class Program For Taking Input
**/
import java.util.Scanner;//util means utilities

class InputClass{
    private byte age;
    private String name;
    public void setValue(){
        Scanner InputScanner = new Scanner(System.in);
        name = InputScanner.nextLine();
        age = InputScanner.nextByte();
        //Did you notice something reference variable InputScanner is used for both string and number
    }
    public void displayValue(){
        System.out.println("Name is "+ name + " Age is " +age);
    }
}
 public class Input{
    public static void main(String[] args){
        InputClass obj = new InputClass();
        obj.setValue();
        obj.displayValue();
    }
}
