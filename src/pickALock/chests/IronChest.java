package pickALock.chests;

import pickALock.Chest;
import pickALock.Position;

import java.util.HashMap;
import java.util.Map;

public class IronChest implements Chest {

    @Override
    public Map<Integer, Position> chest() {
        Map<Integer, Position> chestLockMap = new HashMap<>();

        chestLockMap.put(0, new Position(0,"You have benn spotted ! Running away..."));
        chestLockMap.put(1, new Position(1,"Beginning"));
        chestLockMap.put(2, new Position(2,"Very bad"));
        chestLockMap.put(3, new Position(3,"Very bad"));
        chestLockMap.put(4, new Position(4,"Very bad"));
        chestLockMap.put(5, new Position(5,"Very good"));
        chestLockMap.put(6, new Position(6,"Really close"));
        chestLockMap.put(7, new Position(7,"Bad"));
        chestLockMap.put(8, new Position(8,"Very good"));
        chestLockMap.put(10, new Position(10,"Lock open, treasure gathered !"));

        chestLockMap.get(1).addMove("D", 3);
        chestLockMap.get(1).addMove("L", 2);
        chestLockMap.get(1).addMove("R", 4);

        chestLockMap.get(2).addMove("U", 7);
        chestLockMap.get(2).addMove("D", 3);
        chestLockMap.get(2).addMove("R", 1);

        chestLockMap.get(3).addMove("U", 1);
        chestLockMap.get(3).addMove("D", 4);
        chestLockMap.get(3).addMove("R", 5);
        chestLockMap.get(3).addMove("L", 2);

        chestLockMap.get(4).addMove("U", 3);
        chestLockMap.get(4).addMove("L", 2);

        chestLockMap.get(5).addMove("L", 3);
        chestLockMap.get(5).addMove("U", 6);

        chestLockMap.get(6).addMove("U", 8);
        chestLockMap.get(6).addMove("D", 1);
        chestLockMap.get(6).addMove("R", 10);
        chestLockMap.get(6).addMove("L", 7);

        chestLockMap.get(7).addMove("D", 2);
        chestLockMap.get(7).addMove("R", 8);

        chestLockMap.get(8).addMove("D", 1);
        chestLockMap.get(8).addMove("R", 6);

        return chestLockMap;
    }
}
