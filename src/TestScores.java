import java.util.Objects;
import java.util.Scanner;

import static java.lang.StrictMath.round;

/**
 * @author jmo5660
 * Date of Last Edit 11/9/2021
 * SWENG 311 -- Professor Rossi -- Fall 2021
 */

public class TestScores
{
    static int possibleScore;
    static double scoreEarned;
    public static String assignmentName = "";
    private static boolean checkPossibleScoreSuccess = false;
    private static boolean checkScoreEarnedSuccess = false;

        //method to check/throw error if possible score was entered incorrectly
        void checkPossibleScore(int possibleScore) {
            try {
                if (possibleScore > 0)
                {
                    checkPossibleScoreSuccess = true;
                }
                else
                {
                    throw new InvalidPossibleScoreException(possibleScore);
                }
            } catch (InvalidPossibleScoreException ps)
            {
                System.out.println(ps.getLocalizedErrorMessage());
            }
        }

        //method to check/throw error if points earned was entered incorrectly
        void checkScoreEarned(double scoreEarned, int possibleScore)
        {
            try{
                if(scoreEarned < possibleScore && scoreEarned >= 0 ){
                    checkScoreEarnedSuccess = true;
                }
                else
                {
                throw new InvalidScoreEarnedException(scoreEarned);
                }

            }
            catch (InvalidScoreEarnedException se)
            {
                System.out.println(se.getLocalizedErrorMessage());
                se.resetError();
            }
        }


    public static void main(String[] args)
    {
        int scoreCounter;  //variable to take in input
        double earnedCounter; //variable to take in input

        Scanner input = new Scanner(System.in);
        TestScores s = new TestScores();

        System.out.println("What is the name of the Assignment?");
        assignmentName = input.nextLine();

        //create a loop to add scores until user indicates stop
        while(!Objects.equals(assignmentName, "stop")) {
            System.out.println("Enter the total points possible: ");
            scoreCounter = input.nextInt();
            input.nextLine();

            System.out.println("Enter the total points earned: ");
            earnedCounter = input.nextDouble();
            input.nextLine();

            s.checkPossibleScore(scoreCounter);
            s.checkScoreEarned(earnedCounter, scoreCounter);

            //only add points to final calculation if no exception
            if (checkPossibleScoreSuccess && checkScoreEarnedSuccess){
                possibleScore += scoreCounter;
                scoreEarned += earnedCounter;
            }

            System.out.println("What is the name of the Assignment? (type 'stop' to end)");
            assignmentName = input.nextLine();

        }

        //outside of loop calculate output
        double percentage = (scoreEarned/possibleScore) * 100.00;
        System.out.println("");
        System.out.print("The grade earned from these assignments is " + scoreEarned + "/" + possibleScore + " (");
        System.out.format("%.2f",percentage);
        System.out.println("%)");
    }

}

