package pickALock;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Game {

    private int lockPickDurability = 6;
    private Scanner scanner = new Scanner(System.in);

    public void gamePlay(Chest chestType){

        Map<String, String> vocabulary = wordsVocabulary();

        System.out.println("Instructions: for moving lock pick enter letter\n" +
                "U - up | D - down | L - left | R - right | Q to quit\n" +
                "You can also write full words \"go UP, DOWN, RIGHT, LEFT\"\n" +
                "Follow feeling tips that tells how close you are to open the lock\n" +
                "------ represents lock pick durability. Good Luck !\n");

        int pos = 1;
        while(true){
            System.out.println(chestType.chest().get(pos).getDescription());

            if(pos == 0 || pos == 10){
                break;
            }

            if(this.lockPickDurability == 0){
                System.out.println("Lock jammed");
                break;
            }

            String playerMove = scanner.nextLine().toUpperCase();

            if(playerMove.length() > 1){
                String[] words = playerMove.split(" ");
                for(String word : words){
                    if(vocabulary.containsKey(word)){
                        playerMove = vocabulary.get(word);
                        break;
                    }
                }
            }

            Map<String, Integer> moves = chestType.chest().get(pos).getMoves();

            if(moves.containsKey(playerMove)){
                pos = moves.get(playerMove);
                System.out.println("\nKeep trying");
            }else{
                System.out.println("\nYou can not go that direction");
                this.lockPickDurability -= 1;
            }
            printLockPickDurability();
        }
    }

    public Map<String, String> wordsVocabulary(){
        Map<String, String> vocabulary = new HashMap<>();
        vocabulary.put("QUIT", "Q");
        vocabulary.put("UP", "U");
        vocabulary.put("DOWN", "D");
        vocabulary.put("LEFT", "L");
        vocabulary.put("RIGHT", "R");
        return  vocabulary;
    }

    public void printLockPickDurability(){
        for(int i = 0; i < lockPickDurability; i++){
            System.out.print("-");
        }
        System.out.println();
    }
}
