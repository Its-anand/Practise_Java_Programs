class Swap{
    private int valueOne, valueTwo, temp;
    public void setValue(int value1, int value2){
        valueOne = value1;
        valueTwo = value2;
    }
    public void swapFunction(){
        temp = valueOne;
        valueOne = valueTwo;
        valueTwo = temp;
    }
    public void display(){
        System.out.println(valueOne);
        System.out.println(valueTwo);
    }
}
public class TestRun{
    public static void main(String[] args){
        Swap obj = new Swap();
        obj.setValue(10, 20);
        obj.swapFunction();
        obj.display();
    }
}