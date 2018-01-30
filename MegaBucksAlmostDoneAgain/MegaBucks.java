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
    private ArrayList<Integer> drawNumbers = new ArrayList<Integer>();
    private static Integer[] freqCount = new Integer[6];
    private Integer seventhNum;
    private Integer lottoBon;
    ArrayList<Integer> userNumbers = new ArrayList<Integer>(); 
    final int numOfNums = 6;
    
    String answer;
    /**
     * Constructor for objects of class MegaBucks
     */
    public MegaBucks()
    {
        userNumbers = new ArrayList<Integer>();

        drawNumbers = new ArrayList<Integer>();
        seventhNum = getBonus();
        lottoBon = lottoBonus();
    }
    
     
     
    
    
    
    public void getNums(){
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

        System.out.println("Your numbers are: "+userNumbers + "with a bonus of " + seventhNum);
        
       
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
            System.out.println("Your numbers are: "+userNumbers + " with a bonus of " + seventhNum);
        }
        
     } 
     
    }
    public ArrayList<Integer> genNums ()
    {
        for (int i = 0; i<numOfNums; i ++){
         int num = (int)(Math.random() * 42 + 1);
        while(drawNumbers.contains(num) || num <1|| num > 42)
         {
             
             num = (int)(Math.random() * 42 + 1);
            }
        drawNumbers.add(num);
     }
        return drawNumbers;
    
    }
    public Integer getBonus()
    {
        int num = (int)(Math.random() * 42 + 1);
        while(userNumbers.contains(num) || num <1|| num > 42)
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
                                
                                    return true;        
        return false;
     }
     public void freqCheck(ArrayList<Integer> userNumbers)
     {
             for(int i=0;i<6;i++)
             {
                 freqCount[i] = 0;
                 if(drawNumbers.contains(userNumbers.get(i)))
                    freqCount[i]++;
                }

         
             //if(drawNumbers.contains(userNumbers.get(0)))
             //   freqCount[0]++;
             //if(drawNumbers.contains(userNumbers.get(1)))
             //   freqCount[1]++;   
             //if(drawNumbers.contains(userNumbers.get(2)))
             //   freqCount[2]++;
             //if(drawNumbers.contains(userNumbers.get(3)))
             //   freqCount[3]++;  
             //if(drawNumbers.contains(userNumbers.get(4)))
             //   freqCount[4]++;
             //if(drawNumbers.contains(userNumbers.get(5)))
             //   freqCount[5]++;  
        }
     public ArrayList getUserNums()
     {
         return userNumbers;
        }
        public String toString()
    {
        String str = "This week's numbers are " +
                     drawNumbers.get(0)+", "+drawNumbers.get(1)+", "+
                     drawNumbers.get(2)+", "+drawNumbers.get(3)+", "+
                     drawNumbers.get(4)+", "+drawNumbers.get(5)+"  and a bonus of "+
                     lottoBon;
        return str;
    }    
    public int lottoBonus()
    {
     int lottoBonusNum = (int)(Math.random() * 42 + 1);
        while(drawNumbers.contains(lottoBonusNum) || lottoBonusNum <1|| lottoBonusNum > 42)
         {
             
             lottoBonusNum = (int)(Math.random() * 42 + 1);
            }
        return lottoBonusNum;  
           
    }
    public int retBonus()
    {
     return seventhNum;   
    }
    public void freqAns()
    {
       for(int i = 0; i<6; i++)
       {
        System.out.println(userNumbers.get(i) + " came up " + freqCount[i] + " times");      
     }
    }
    public int retLotBon()
    {
     return lottoBon;   
    }
    }
    

