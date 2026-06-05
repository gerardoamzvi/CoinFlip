import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        boolean valid_entry = false;
        int number_of_trows = 0;
        int heads_number = 0;
        int tails_number = 0;

        Scanner user_input = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Welcome to CoinFlip Probability Simulator!");

        while (!valid_entry) {
            System.out.print("Enter the number of simulation you want to do : ");
            try {
                number_of_trows = user_input.nextInt();
                if (number_of_trows < 0){
                    System.out.println("Please enter a positive number");
                }
                else{
                    System.out.println("Let see what it will give with" + number_of_trows + " simulations");
                    valid_entry = true;
                }

            } catch (Exception e) {
                System.out.println("Your entry was not correct is must be an integer\n");
                user_input.nextLine();
            }

        }

        if (number_of_trows == 0){
                System.out.println("No simulation was made");
        } else{
            for (int i = 1; i <= number_of_trows; i++){
                boolean side_value = random.nextBoolean();

                if (side_value){
                    heads_number += 1;
                }
                else {
                    tails_number += 1;
                }
            }
            int total = heads_number + tails_number;
            float percentage_of_heads = (float) heads_number/total * 100;
            float percentage_of_tails = (float) tails_number/total * 100;
            System.out.println("For "+ heads_number + " head(s) and " + tails_number + " tail(s)");
            System.out.println("You got" + percentage_of_heads  + "% of heads");
            System.out.println("You got" + percentage_of_tails + "% of tails");

        }

    user_input.close();
    }
}