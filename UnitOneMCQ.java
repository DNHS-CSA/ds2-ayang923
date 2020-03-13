
/**
 * Write a description of class UnitOneMCQ here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UnitOneMCQ
{
    public static void main(String[] args) {
        //1.3
        System.out.print('\u000c');
        
        System.out.println("1.3 Which of the following evaluates to 1");
        System.out.println(String.format("%s = %d ", "2 / 5 % 3", 2 / 5 % 3));
        System.out.println(String.format("%s = %d ", "2 / (5 % 3)", 2 / (5 % 3)));
        System.out.println(String.format("%s = %d ", "2 / 5 + 1", 2 / 5 + 1));
        
        System.out.println();
        
        //1.5
        System.out.println("1.5 What is the result 0f");
        System.out.println("double d = 0.25;\n" +
        "int i = 3;\n" +
        "double diff = d-i;\n" +
        "System.out.print((int)diff - 0.5)\n");
        
        double d = 0.25;
        int i = 3;
        double diff = d-i;
        System.out.println((int)diff - 0.5);
        
        System.out.println();
        
        //1.5
        System.out.println("What does this print out?");
        System.out.println("double fact1 = 1/2;\n" +
        "double fact2 = 3*4;\n" +
        "double product = fact1 * fact2;\n" +
        "System.out.println(product);\n");
        
        double fact1 = 1/2;
        double fact2 = 3*4;
        double product = fact1 * fact2;
        System.out.println(product);
    }
}
