class Test{
    private final static int a=10; //I used final because I assigned 10 in a which is constant
    public static void fun(){
        System.out.println(a);
    }
}
public class staticMember {
    public static void main(String[] args){
        Test.fun();
    }
}
