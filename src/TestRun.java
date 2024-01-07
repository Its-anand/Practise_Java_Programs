public class TestRun{
    public static void main(String[] args){
        int add=0;
        for (String arg : args) {
            add = add + Integer.parseInt(arg);
        }
        System.out.println(add);
    }
}