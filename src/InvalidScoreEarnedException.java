public class InvalidScoreEarnedException extends Exception
{
    String output;
    int error = 0;
    public InvalidScoreEarnedException(double scoreEarned)
    {

        if(scoreEarned < 0)
        {
            error += 1;
        }
        if(scoreEarned > TestScores.possibleScore)
        {
            error += 2;
        }
        if (error == 1)
        {
            output = "You cannot score negative points on a quiz. TRY AGAIN.";
        }
        else if (error == 2)
        {
            output = "Extra-Credit Does not Exist. You cannot score more points than you could earn. TRY AGAIN.";
        }
        else if (error >= 3)
        {
            output = "I'm not even sure how you got negative points and more points than possible. Give up.";
        }

    }
    public String getLocalizedErrorMessage()
    {
        return output;
    }

    public void resetError()
    {
        error = 0;
    }
}
