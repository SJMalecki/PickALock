package pickALock;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Game {

    private Scanner scanner = new Scanner(System.in);

    public void gamePlay(Chest chestType){

        Map<String, String> vocabulary = wordsVocabulary();

        System.out.println("Instructions enter: U - to move pick up, D to move pick down, " +
                "L to move pick left, R to move pick right. Q to quit");
        int pos = 1;
        while(true){
            System.out.println(chestType.chest().get(pos).getDescription());

            if(pos == 0 || pos == 10){
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
            }else{
                System.out.println("You can not go that direction");
            }
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
}