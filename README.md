# testscoreExceptionHandling
Background

It is possible that junk data can be entered into a program.  As programmers it is our responsibility to handle such situations and ensure that our program does not fail or return back incorrect information.  For this assignment you will build a program that will take in assignment names and the grades received.  The program should throw an exception (and catch and handle the exception) if the assignment possible points is less than or equal to 0.  Similarly, if the user inputs a score that is higher than the possible points or is less than zero another exception should be thrown (and handled).  When the program ends, the user's average score should be printed.

 

Objectives

By completing this assignment, student should be able to:

    Write programs that utilize exception handling

 

Instructions

Write a program that starts by asking the user for the name of the assignment.  The user should then be prompted for the total possible points for the assignment and then the points they received.  The program should then try and create a new Assignment object for the given information.  The constructor should throw either an InvalidPossibleScoreException or an InvalidScoreEarnedException (described below).  If either of these happens, the exception should be caught by the main class and the user given feedback as to what was invalid.

 

When the user enters the word "stop" for the assignment name the program should then compute the average of the assignment scores, print the average for all of the valid assignments entered and then shut down.

 

InvalidPossibleScoreException

This exception is a checked exception and should be thrown if the constructor is passed a value for the possible points that is less than or equal to 0.

 

InvalidScoreEarnedException

This exception is a checked exception and should be thrown if the constructor is passed a value for the points earned that is either less than zero or greater than the possible points.

 

Notes

    Each exception should be its own class.

    You can assume that the points possible is an integer and the points earned is a double.
    Your program must catch all exceptions you throw.

    Your main class must be called TestScores.java

 

Sample Execution

What is the name of the assignment: Assignment1
Enter the total points possible: 0
Enter the total points earned: 0
ERROR: THE POINTS POSSIBLE IS INVALID

What is the name of the assignment: Assignment1
Enter the total points possible: 40
Enter the total points earned: -1
ERROR: THE POINTS EARNED IS INVALID

What is the name of the assignment: Assignment1
Enter the total points possible: 40
Enter the total points earned: 20
What is the name of the assignment: stop

The grade earned from these assignments is 20 / 40 (50.00%)

 
