import java.util.Random;
import java.util.Scanner;

public class App {
    final String ROCK = "ROCK";
    final String PAPER = "PAPER";
    final String SCISSORS = "SCISSORS";
    static Scanner in = new Scanner(System.in);

    public String input() {
        System.out.println("Enter your choice(ROCK, PAPER OR SCISSORS)");
        while (true) {
            String input = in.next();
            input = input.toUpperCase();
            switch (input) {
                case ROCK:
                    return input;
                case PAPER:
                    return input;
                case SCISSORS:
                    return input;
                default:
                    System.out.println("Wrong choice Try again");
            }
        }
    }

    public String generator() {
        String[] options = { "ROCK", "PAPER", "SCISSORS" };
        Random random = new Random();
        int choice = random.nextInt(3);
        return options[choice];
    }

    public void matcher() {
        String botChoice = generator();
        String playerChoice = input();
        System.out.println("The bot chose - " + botChoice);
        System.out.println(checker(playerChoice, botChoice));
    }

    public String checker(String playerChoice, String botChoice) {
        if (playerChoice.equals(botChoice)) {
            return "Its a draw";
        } else if (botChoice.equals(ROCK) && playerChoice.equals(PAPER)) {
            return "You won";
        } else if (botChoice.equals(ROCK) && playerChoice.equals(SCISSORS)) {
            return "You lose";
        } else if (botChoice.equals(PAPER) && playerChoice.equals(SCISSORS)) {
            return "You won";
        } else if (botChoice.equals(PAPER) && playerChoice.equals(ROCK)) {
            return "You lose";
        } else if (botChoice.equals(SCISSORS) && playerChoice.equals(ROCK)) {
            return "You won";
        } else if (botChoice.equals(SCISSORS) && playerChoice.equals(PAPER)) {
            return "You lose";
        }
        return "";
    }

    public static void main(String[] args) throws Exception {
        char con = 'Y';
        App RPS = new App();
        while (true) {
            RPS.matcher();
            System.out.println("Do you want to continue to play(Y/N)");
            con = in.next().charAt(0);
            con = Character.toUpperCase(con);
            if (con == 'N') {
                System.out.println("Closing");
                in.close();
                return;
            }
        }
    }
}
