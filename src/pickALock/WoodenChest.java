package pickALock;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WoodenChest implements Chest{

    public Map<Integer, Position> chest(){
        Map<Integer, Position> chestLockMap = new HashMap<>();

        chestLockMap.put(0, new Position(0,"You have benn spotted ! Running away..."));
        chestLockMap.put(1, new Position(1,"Start"));
        chestLockMap.put(2, new Position(2,"Feeling really bad"));
        chestLockMap.put(3, new Position(3,"Feeling good"));
        chestLockMap.put(4, new Position(4,"Feeling bad"));
        chestLockMap.put(5, new Position(5,"Feeling really good"));
        chestLockMap.put(10, new Position(10,"Lock open, treasure gathered !"));

        chestLockMap.get(1).addMove("D", 3);
        chestLockMap.get(1).addMove("L", 2);

        chestLockMap.get(2).addMove("R", 1);
        chestLockMap.get(2).addMove("D", 3);

        chestLockMap.get(3).addMove("U", 1);
        chestLockMap.get(3).addMove("D", 4);
        chestLockMap.get(3).addMove("L", 2);
        chestLockMap.get(3).addMove("R", 5);

        chestLockMap.get(4).addMove("U", 3);

        chestLockMap.get(5).addMove("L", 3);
        chestLockMap.get(5).addMove("R", 10);

        return chestLockMap;
    }
}
