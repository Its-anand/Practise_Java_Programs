class literalsClass{
    private final int a = 0b1010;//Binary
    private final int b = 0x7E; //Hex-Decimal
    private final int c = 1_00_00_00_000; // Java allow to put underscore to make counting more readable.

    private final double d = 10; // Type conversion from int to double is possible in java
    private final double e = 10e20; // Epsilon is available in java to and that too can be converted from int to double
    private final char character = 'z'; // Use single quote for char data type
    //If we add any number with character like character = character+1 or character++
    // then it will be added into unicode and will show next unicode like after
    // z next unicode value is { so it will show {
    public void show(){
        System.out.println("Binary: "+a);
        System.out.println("Hex-decimal :"+b);
        System.out.println("Value Separator 1_00_00_00_000 :"+c);
        System.out.println("Auto Type conversion 10 to :"+d);
        System.out.println("Auto Type conversion from Epsilon 10e20 to double :"+e);
        System.out.println("Increment decrement in character: "+character);
    }
}
public class literals {
    public static void main(String[] args){
        literalsClass obj = new literalsClass();
        obj.show();
    }
}
