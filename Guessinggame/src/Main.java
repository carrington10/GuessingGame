
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        boolean keep = false;

        System.out.print("Hello would you like to play the guessing game");
        Scanner sc = new Scanner(System.in);
        String answer = sc.next();
        if(answer.equals("yes")){
            Game game = new Game();
            game.start();
            while(keep != true){
                System.out.println("Guess the number");
                int number = sc.nextInt();
                keep = game.guess(number);
            }// end of while





        }// end of else
	// write your code here
    }
}
