
/**
 * Write a description of class UnitTwoFRQ here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UnitTwoFRQ
{
    /**
     * Constructor for objects of class UnitTwoFRQ
     */
    public UnitTwoFRQ()
    {
        // initialise instance variables
        x = 0;
    }

    public static void main(String[] args) {
        //a
        LightSequence gradShow = new LightSequence("0101 0101 0101");
        
        //b
        gradShow.display();
        
        //c
        gradShow.changeSequence("0011 0011 0011");
        
        //d
        String resultSeq = gradShow.insertSegment("1111 1111", 4);
        
        //e
        String newSeq = oldSeq.replaceFirst(segment, "");
        
        //f
        System.out.println(Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
    }
}
