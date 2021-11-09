public class InvalidPossibleScoreException extends Exception
{
    public String output;
    public InvalidPossibleScoreException(int possibleScore)
    {
        if(possibleScore <= 0)
        {
           output = "Possible points must be greater than 0. Error sequence initiated. TRY AGAIN.";
        }

    }
    public String getLocalizedErrorMessage()
    {
        return output;
    }

}
