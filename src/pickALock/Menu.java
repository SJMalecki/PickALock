package pickALock;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    private Game game = new Game();
    private Scanner scanner = new Scanner(System.in);

    public void menu(){
        boolean quit = false;

        while(!quit){
            printMenu();
            int userChoice = integerScanner();

            switch (userChoice){
                case 0:
                    quit = true; break;
                case 1:
                    game.gamePlay(new WoodenChest()); break;
                case 2:
                    game.gamePlay(new WoodenChest()); break;
                default:
                    System.out.println("invalid number"); break;
            }
        }

    }

    public void printMenu(){
        System.out.println("\nPress\n" +
                "0 - to quit\n" +
                "1 - to attempt to open wooden chest\n" +
                "2 - Work in progress //TODO next chests lock patterns\n");
    }

    public int integerScanner() {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException ime) {
                System.out.println("Invalid value, enter number: ");
                scanner.nextLine();
            }
        }
    }
}