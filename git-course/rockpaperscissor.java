import java.util.Random;
import java.util.Scanner;

public class rockpaperscissor {

    public static void main(String[] args) {

        String[] rps = {"r", "p", "s"};
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int totalrounds=0;
        int wins=0;
        int losses=0;
        int ties=0;
        
        
        while (true) {

            String computermove = rps[random.nextInt(rps.length)];
            String playermove;

            // Input validation
            while (true) {
                System.out.println("Enter your move (r, p, s): ");
               playermove = scanner.nextLine().toLowerCase();
               totalrounds++;

                if (playermove.equals("r") || playermove.equals("p") || playermove.equals("s")) {
                    break;
                }

                System.out.println("Invalid choice! Try again.");
            }

            System.out.println("You chose: " + playermove);
            System.out.println("Computer chose: " + computermove);

            // Game logic
//            if (playermove.equals(computermove)) {
//                System.out.println("It's a tie!");
//                ties++;
//            }
////            totalrounds++;

            if(playermove.equals(computermove)){
                System.out.println("It is tie..!!");
                ties++;
            }
            else if(playermove.equals("r")){
                if(computermove.equals("p")){
                    System.out.println("You lose..!");
                    losses++;
                } else {
                    System.out.println("You win..!!");
                    wins++;
                }
            }
            else if(playermove.equals("p")){
                if(computermove.equals("r")){
                    System.out.println("You win..!");
                    wins++;
                } else {
                    System.out.println("You lose..!!");
                    losses++;
                }
            }
            else if(playermove.equals("s")){
                if(computermove.equals("p")){
                    System.out.println("You win..!");
                    wins++;
                } else {
                    System.out.println("You lose..!!");
                    losses++;
                }
            }
//            else if (playermove.equals("r")) {
//                System.out.println(computermove.equals("s") ? "You win!" : "You lose!");
//            } else if (playermove.equals("p")) {
//                System.out.println(computermove.equals("r") ? "You win!" : "You lose!");
//            } else {
//                System.out.println(computermove.equals("p") ? "You win!" : "You lose!");
//            }

            // Play again
            System.out.println("Do you want to continue? (y/n): ");
            String playagain = scanner.nextLine().toLowerCase();

            if (!playagain.equals("y")) {
                System.out.println("Thanks for playing...👍");
                break;
            }
        }

        scanner.close();
        System.out.println("***Your Total Score***");
        System.out.println("total rounds palyed : "+totalrounds);
        System.out.println("your wins : "+ wins);
        System.out.println("your losses : "+losses);
        System.out.println("ties : "+ ties);
    }
}

