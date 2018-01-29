import java.util.Scanner;
import java.util.ArrayList;
/**
 * Write a description of class MegaBucks here.
 *
 * @KhatiwadaSakusal & BhattShabit
 * @version 1/11/2018
 */
public class MegaBucks
{
    // instance variables - replace the example below with your own
    Scanner scan = new Scanner (System.in);
    private ArrayList<Integer> drawNumbers;
    private static int[] freqCount = new int[6];
    private Integer seventhNum;
    /**
     * Constructor for objects of class MegaBucks
     */
    public MegaBucks()
    {
        drawNumbers = genNums();
        seventhNum = getBonus();
    }
    public ArrayList<Integer> genNums ()
    {
        int num = (int)(Math.random() * 42 + 1);
        while(drawNumbers.contains(num) || num <1|| num > 42)
         {
             
             num = (int)(Math.random() * 42 + 1);
            }
        drawNumbers.add(num);    
        return drawNumbers;
    }
    public Integer getBonus()
    {
        int num = (int)(Math.random() * 42 + 1);
        while(drawNumbers.contains(num) || num <1|| num > 42)
         {
             
             num = (int)(Math.random() * 42 + 1);
            }
        return num;    
    }
    public boolean winCheck(ArrayList<Integer> userNumbers)
    {
        if (drawNumbers.contains(userNumbers.get(0)))
           
            if(drawNumbers.contains(userNumbers.get(1)))
                
                if(drawNumbers.contains(userNumbers.get(2)))
                    if(drawNumbers.contains(userNumbers.get(3)))
                        if(drawNumbers.contains(userNumbers.get(4)))
                            if(drawNumbers.contains(userNumbers.get(5)))
                                if(drawNumbers.contains(userNumbers.get(6)))
                                    return true;        
        return false;
     }
     public void freqCheck(ArrayList<Integer> userNumbers)
     {
         
        }
    }
    

