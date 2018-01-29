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
     final int numOfNums = 6;
    
    
    
    
     System.out.println("Do you want to input your own numbers? (Enter 'Yes' if you want to choose your own numbers, if not enter anything)");
     String answer = scan.nextLine().toUpperCase();
     if (answer.equals("YES"))
        {
            for (int i=0;i<numOfNums;i++)
      {
        System.out.println("Please enter your 6 different numbers between 1 and 42 for the lottery.");
        int num =(scan.nextInt());
        while(userNumbers.contains(num) || num<1 || num>42)
        {
         System.out.println("Try again, number must be between 1 and 42, and you cannot have two of the same number");
         num = scan.nextInt();
        }
        userNumbers.add(num);

        System.out.println("Your numbers are: "+userNumbers);
        
       
      }
        }
     else
     {
        for (int i =0; i<numOfNums; i++)
      {
         int num = (int )(Math.random() * 42 + 1);
         while(userNumbers.contains(num) || num <1|| num > 42)
         {
             
             num = (int )(Math.random() * 42 + 1);
            }
            userNumbers.add(num);
            System.out.println("Your numbers are: "+userNumbers);
        }
     }   
    
    
 
   
  
     }
  }
    

    
    

    
 
