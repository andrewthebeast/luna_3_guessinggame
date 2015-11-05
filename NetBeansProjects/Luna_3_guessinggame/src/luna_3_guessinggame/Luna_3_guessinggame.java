
package luna_3_guessinggame;

import java.util.Scanner;
import java.util.Random;

public class Luna_3_guessinggame {

    static int magicnumber;
    static int userguess;
    static String username;
    static Random randy = new Random();
    static boolean playagain;
    static int counter;
            
    public static void main(String[] args) {
        playagain = true;
        magicnumber = randy.nextInt(100);
        counter = 5;
        System.out.println("Hello, would you like to play");
        System.out.println("What's your name");
        Scanner userinputname = new Scanner(System.in);
       // Scanner sc = new Scanner(System.in);
        //Two main ones we need
       // int something = sc.nextInt();
       // sc.nextLine();
        username = userinputname.nextLine();
        System.out.println("Hello " + username + " Let's play a game");
        
        //runs while the condition is true
        while (counter > 0 && playagain) {
       
        playthegame();
        guess3Times();
        counter--;
         if(counter < 1){
        System.out.println("YOU LOOSE");

        }
         else{

         }
        }
    }
    
        static void playthegame(){
            Scanner userinputnumbers = new Scanner(System.in);
            System.out.println("Please pick a number between 0 and 100");
            userguess = userinputnumbers.nextInt();
            if(magicnumber == userguess){
                System.out.println("You Win");
                playagain = false;
            }else if (magicnumber > userguess){
                System.out.println("Too low! Try again");
            }else {
                System.out.println("Too high! Try again");
            }
        }
         static void guess3Times(){
            Scanner guessesfromuser = new Scanner(System.in);
            if(userguess > 1) {
                    System.out.println("You have " + counter + " guesses left!");
            }else if (counter == 1 ){
                System.out.println("You have one guess left");
            }else if (userguess == 0 ) {
                System.out.println("You have ran out of guesses.Tou lose!");
                playagain = false;
            }
            playagain = true;
         }
}
