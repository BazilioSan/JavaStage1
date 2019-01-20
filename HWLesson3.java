/**
 Java. Level 1. Lesson 3. Homework
 @author Alexandr Shchekochikhin
 @version dated 20/01/19
 */

import java.util.Random;
import java.util.Scanner;

public class HWLesson3 {

    /* Task 1. Write a program, which ask random digit from 0 to 9, and user try to guess this digit by 3 tries.
    In each try computer must to alarm about more or less this digit relative to the ask.
    After win or loss must to ask about restart.
     */

    private static Scanner sc = new Scanner(System.in);
    private static Random rnd = new Random();

    public static void main(String[] args) {

        do {guessDigit();
        }while (askNewGame ( ) == 1);
    }

    static void guessDigit () {

        System.out.println("Lets play! guess a digit! You have a 3 tries. Choose your digit! ");
            int askDigit = rnd.nextInt(10);
            for (int i = 0; i < 3; i++) {
                int userDigit = sc.nextInt();
                if (userDigit == askDigit) {
                    System.out.println("You win!"); break;
                } else if (userDigit < askDigit) {
                    System.out.println("Your digit less!!");
                } else {
                    System.out.println("Your digit more!!");
                }
            }
    }
    static int askNewGame () {
        System.out.println("Wanna play again? 1- yes 2- no");
        return sc.nextInt();
    }
}

