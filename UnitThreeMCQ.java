
/**
 * Write a description of class UnitThreeMCQ here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UnitThreeMCQ
{
    public static void main(String[] args) {
        //3.3
        System.out.println("3.3");
        int temp = 30;
        String weather;
        if (temp <= 31)
        {
            weather = "cold";
        }
        else
        {
            weather = "cool";
        }
        if (temp >= 51)
        {
            weather = "moderate";
        }
        else
        {
            weather = "warm";
        }
        
        System.out.println("this code is supposed to print cold, but it prints:");
        System.out.print(weather);
            
        System.out.println();
        System.out.println();
        
        //3.7
        System.out.println("3.7");
        System.out.println("this code segment prints: ");
        
        String first = new String("duck");
        String second = new String("duck");
        String third = new String("goose");
        if (first == second)
        {
        System.out.print("A");
        }
        else if (second == third)
        {
        System.out.print("B");
        }
        else if (first.equals(second))
        {
        System.out.print("C");
        }
        else if (second.equals(third))
        {
        System.out.print("D");
        }
        else
        {
        System.out.print("E");
        }
        System.out.println();
        System.out.println("because .equals() compares the value of string");
        
        //3.6
        System.out.println();
        System.out.println("3.6");
        int j = 3;
        int k = 4;
        int m = 5;

        System.out.println("!((j == k) && (k > m)) returns");
        System.out.println(!((j == k) && (k > m)));
        
        System.out.println("(j != k) || (k <= m) returns");
        System.out.println((j != k) || (k <= m));
    }

    }
