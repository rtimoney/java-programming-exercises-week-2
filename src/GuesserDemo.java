import java.util.Random
;
import java.util.Scanner
;
/**
* Class for Guessing game app
* @author amcgowan
*/
public class GuesserDemo {
/**
* Generates a random number between 1
-10. User tries to guess it.
*
@param args
*/
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
Random random = new Random();
int randomNumber, userGuess
;
// default value
userGuess =-1;
// get the random number
randomNumber = random.nextInt(10);
randomNumber++;
while (randomNumber != userGuess) {
// get user input
System.out.println("Enter your guess (1-10) ?");
userGuess = scanner.nextInt(); }
System.out.println("Well done.. you got it !");
scanner.close();
}
}