import java.util.Scanner;
public class NewSwitch {
    public static void main(String[] args){
        int choose;
        Scanner input = new Scanner(System.in);
        choose = input.nextInt();
        int result;
        result = switch (choose){
            case 1 -> 1;
            case 2 -> 4;
            case 3 -> 9;
            default -> 0;
        };
        System.out.println(result);
    }
}
