  
/**
 * Write a description of class UnitThreeFRQ here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UnitThreeFRQ
{
    public static void main(String[] args) {
        
        //a
        if(rsvp) {
            System.out.println("attending");
        }
        else {
            System.out.println("not attending");
        }
        
        //b
        switch (selection) {
            case (1):
                System.out.println("beef");
                break;
            case (2):
                System.out.println("chicken");
                break;
            case(3):
                System.out.println("pasta");
                break;
            default:
                System.out.println("fish");
                break;   
        }
    
        //c
        if (rsvp){
            option1 = "Thanks for attending. ";
            switch (selection) {
                case (1):
                    option1 += "You will be served beef";
                    break;
                case (2):
                    option1 += "You will be served chicken";
                    break;
                case(3):
                    option1 += "You will be served pasta";
                    break;
                default:
                    option1 += "You will be served fish";
                    break;   
            }
        }
        else {
            option1 = "Sorry you can't make it";
        }
        
        //d
        System.out.println(option1.equals(option2));
    }
    
    public void drawSquare(int x, int y, int len) {
        int newLen = Math.min(Math.min(x + len, 10) - x, y - Math.max(y - len, 0));
        
        drawLine(x, y, x + newLen, y);
        drawLine(x + newLen, y, x + newLen, y - newLen);
        drawLine(x + newLen, y - newLen, x, y - newLen);
        drawLine(x, y - newLen, x, y);
    }
}


