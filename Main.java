import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int maxNum = 100;
        int minNum = 1;
        int maxRounds = 3;
        int maxAttempts = 10;
        int totalScore=0;
        int score=0;

        System.out.println("Total Number of Rounds: "+maxRounds);
        for(int i=0; i<maxRounds; i++){
            int number = random.nextInt(minNum, maxNum);
            int attempts = 0;

            System.out.println("Round "+(i+1)+": Guess the number between "+minNum+" and "+maxNum+" in "+attempts);
            while(attempts < maxAttempts){
                System.out.println("Enter Your Guess: ");
                int guessNumber = sc.nextInt();
                attempts++;

                if(guessNumber == number){
                    score = maxAttempts-attempts;
                    totalScore = totalScore+score;
                    System.out.println("Number Guess successfully.");
                    System.out.println("Attempts: "+attempts);
                    System.out.println("Round Score: "+score);
                    break;
                }

                else if(guessNumber < number){
                    System.out.println("The number is greater than "+guessNumber+", Attempts left: "+(maxAttempts-attempts));
                }

                else if(guessNumber > number){
                    System.out.println("The number is less than "+guessNumber+", Attempts left: "+(maxAttempts-attempts));
                }
            }

            if(attempts == maxAttempts){
                System.out.println("Round: "+i+1);
                System.out.println("Attempts: 0");
                System.out.println("The Random Number is: "+number);
            }
        }
        System.out.println("Game Over. Total Score = "+totalScore);
    }
}
