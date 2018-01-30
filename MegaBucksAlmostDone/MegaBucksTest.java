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
        int wonNums = 0;
        int bonusCount = 0;

     
        System.out.println("Welcome to the Megabucks Lottery System");
        MegaBucks drawTemp = new MegaBucks();
        
        drawTemp.getNums();
        
        drawTemp.getBonus();
        drawTemp.retBonus();
        
        
        for(int i = 0; i<104; i++){
         MegaBucks draw = new MegaBucks();
         draw.genNums();
         draw.lottoBonus();

         if(drawTemp.retBonus() == draw.lottoBonus())
         {
             bonusCount++;
            }
         draw.winCheck(drawTemp.getUserNums());
         System.out.println("This was drawing number " + (i+1));
         System.out.println(draw);
         System.out.println("Your bonus number "+ drawTemp.retBonus() +" won " + bonusCount + " times");
         drawTemp.freqCheck(drawTemp.getUserNums());
         System.out.println();
         if(draw.winCheck(drawTemp.getUserNums())==true)
         {
             
             System.out.println("You won the lottery on the" + (i+1) + "week !! Congratulations");
             wonNums++;
            }
         
        }
        drawTemp.freqAns();
        System.out.println("You won the lottery " + wonNums + " times");
       
    
    
 
   
  
     }
  }
    

    
    

    
 
