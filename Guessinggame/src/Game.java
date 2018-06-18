import java.util.Random;
import java.util.Scanner;
public class Game {
  private  int guessing = 0;
   private int number;

    public void start(){
        Random rand = new Random();
        number =  rand.nextInt(100);
    }// end of start game
    public boolean guess(int gNumber){
        if(gNumber == number){
            System.out.println("Congrats you guess right");
            System.out.println("Guesses " + guessing);
            return true;

        }// end of if
        else if (gNumber < number){
            System.out.print("To low guess again");
            guessing++;
            return false;
        }// end of else if
        else{
            System.out.print("To high guess again");
            guessing++;
            return true;
        }// end of else case

    }// end of guess


}// end of game class
