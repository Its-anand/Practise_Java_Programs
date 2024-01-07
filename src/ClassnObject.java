import java.util.Scanner;

class BasicClass{
    private Integer num1 = null, num2 = null;
    public void setValue(){
        Scanner input = new Scanner(System.in);
        num1 = input.nextInt();
        num2 = input.nextInt();
    }
    public void add(){
        System.out.print(num1+num2);
    }

}
public class ClassnObject {
    public static void main(String[] args){
        BasicClass obj = new BasicClass();
        obj.setValue();
        obj.add();
    }
}
