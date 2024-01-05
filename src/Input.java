/*
Class Program For Taking Input
**/
import java.util.Scanner;//util means utilities

class InputClass{
    private byte a, b;
    public void setValue(){
        Scanner InputScanner = new Scanner(System.in);
        a = InputScanner.nextByte();
        b = InputScanner.nextByte();
    }
    public void displayValue(){
        System.out.println("Value of a is "+ a + " Value of b is " +b);
    }
}
 public class Input{
    public static void main(String[] args){
        InputClass obj = new InputClass();
        obj.setValue();
        obj.displayValue();
    }
}
