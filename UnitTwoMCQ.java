
/**
 * Write a description of class UnitTwoMCQ here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UnitTwoMCQ
{
    public static void main(String[] args) {
        //2.2
        System.out.println("2.2");
        System.out.println("Which gives a variable the value null?");
        System.out.println("Class objectName;");
        System.out.println("objectName has a value of null");
        
        System.out.println();
        //2.9
        System.out.println("2.9");
        System.out.println("Write code that rrandomly prints 2, 4, 6, or 8");
        
        System.out.println("int val = (int) (Math.random() * 4 + 1\n" +
        "val *= 2;\n" +
        "System.out.println(val);");
        
        int val = (int) (Math.random() * 4 + 1);
        val *= 2;
        System.out.println(val);
    }
}
