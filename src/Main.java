import java.util.Random;
import java.util.Scanner;

public class Main {


    //•The ability to play again
    //•A running score for the player Vs computer
    //•Validation on the users entry (i.e. check they selected something valid)
    //•Your own flair element (add a random element of your choice to the game to enhance it e.g. there is a bonus round where you get to also pick a grenade and that gives 0 points to either player if picked)
    public static boolean wannaPlay = true;
    public static int score = 0;

    public static void mainMenu() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("[1]play\n[2]quit");
            int userChoice = sc.nextInt();
            switch (userChoice) {
                case (1) -> playGame();
                case (2) -> System.out.println("Thanks for trying!");
                default -> {
                    System.out.println("Invalid input");
                    wannaPlay = true;
                }
            }

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public static void playGame() {
        Scanner scan = new Scanner(System.in);
        Random randint = new Random();
        int botLocation = randint.nextInt(3);
        System.out.println("1.Rock\n2.Paper\n3.Scissors");
        int userChoice = scan.nextInt();
        switch (userChoice) {
            case (1) -> System.out.println(hasUserWon(0, botLocation));
            case (2) -> System.out.println(hasUserWon(1, botLocation));
            case (3) -> System.out.println(hasUserWon(2, botLocation));
            default -> System.out.println("Invalid input!");
        }

    }

    public static String hasUserWon(int userArrayLocation, int botLocation) {
        //String[] index = {"Rock", "Paper", "Scissors"};
        if (userArrayLocation == botLocation) {
            return "Tie!";
        } else if (userArrayLocation == 0 && botLocation == 2) {
            if (score > 0) score -= score;
            return "You lose!";
        } else if (userArrayLocation == 1 && botLocation == 2) {
            score = +score;
            return "You win!";
        } else if (userArrayLocation == 2 && botLocation == 1) {
            if (score > 0) score -= score;
            return "You lose";

        } else if (userArrayLocation == 0 && botLocation == 1) {
            score = +score;
            return "You win!";

        } else if (userArrayLocation == 2 && botLocation == 0) {
            if (score > 0) score -= score;
            return "You lose";
        } else if (userArrayLocation == 1 && botLocation == 0) {
            score = +score;
            return "You win!";
        } else {
            return "-1";
        }
    }


    public static void main (String[]args){
        int score = 0;

        while (wannaPlay = true){
            mainMenu();
            System.out.println("Score:" + score);

        }



        }
    }
