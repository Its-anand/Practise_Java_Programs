class dynamic{
    dynamic(int a, int b){
        System.out.print(a+b);
    }
    dynamic(float a, float b){
        System.out.println(a+b);
    }
    dynamic(double a, double b){
        System.out.println(a+b);
    }
    dynamic(char a, char b){
        System.out.println("Only integer values are allowed");
    }

    dynamic(String a, String b){
        System.out.println("Only integer values are allowed");
    }
    dynamic(){
        System.out.println("No parameter passed");
    }
}
public class methodOverloading {
    public static void main(String[] args){
        dynamic obj = new dynamic();
    }
}
