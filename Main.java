import java.util.Random;
import java.util.Scanner;
/**
 * This program generate a random integer and let user guess it.
 * After the user guessed the correct number, it will print the
 * number of time the user guessed.
 * @author Joanna Hsiao
 * @version 1.0
 */
public class Main
{
    // instance variables - replace the example below with your own
    private final int RANGE = 100;

    /**
     * Constructor for objects of class Main
     */
    public Main()
    {
        System.out.print('\u000C'); // clean screen   

        int answer = getRandomNum();
        int currentAttempt = 0;
        int userTries = 0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Guess a number! Choose from 1 to 100.");
        while (currentAttempt != answer)
        {
           currentAttempt = input.nextInt();
           if (currentAttempt > 100 || currentAttempt < 1)
            System.out.println("Choose from 1 to 100.");
           else
           {
               userTries++;
               if(currentAttempt < answer)
                System.out.println("Too small!");
               else if(currentAttempt > answer)
                System.out.println("Too large!");
           }
        }

        System.out.println("Congrats! You guessed right!");
        System.out.println("It took you " + userTries + " time.");
        
    }

    /**
     * This method create a random number generator and return a random 
     * number within range
     *
     * @return    a random number within range
     */
    private int getRandomNum()
    {
        Random randGenerator = new Random();
        return randGenerator.nextInt(RANGE);
    }
}
