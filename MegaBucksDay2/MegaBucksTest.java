import java.util.Scanner;
import java.util.ArrayList;

/**
 * Write a description of class MegaBucksTest here.
 *
 * @KhatiwadaSakusal & BhattShabit)
 * @version (a version number or a date)
 */
public class MegaBucksTest
{
    public static void main(String[] args)
    {// instance variables - replace the example below with your own
    Scanner scan = new Scanner(System.in);
    ArrayList<Integer> userNumbers = new ArrayList<Integer>();
    //System.out.println("Enter your 6 numbers for the lottery, please enter 6 different numbers");
    final int numOfNums = 6;
    
    
    for (int i=0;i<numOfNums;i++)
    {
        System.out.println("Enter your 6 numbers for the lottery, please enter 6 different numbers");
        userNumbers.add(scan.nextInt());
        if(userNumbers.contains(userNumbers))
        {
         System.out.println("No duplicates! Try again");
         System.out.println("Enter your 6 numbers for the lottery, please enter 6 different numbers");
        userNumbers.add(scan.nextInt());
        }
        System.out.println(userNumbers);
       
    }
    
  }
    

    
    

    
 }
