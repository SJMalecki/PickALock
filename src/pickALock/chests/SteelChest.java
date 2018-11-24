package pickALock.chests;

import pickALock.Chest;
import pickALock.Position;

import java.util.HashMap;
import java.util.Map;

public class SteelChest implements Chest {

    @Override
    public Map<Integer, Position> chest() {
        Map<Integer, Position> chestLockMap = new HashMap<>();

        chestLockMap.put(0, new Position(0,"You have benn spotted ! Running away..."));
        chestLockMap.put(1, new Position(1,"Beginning"));
        chestLockMap.put(2, new Position(2,"Very bad"));
        chestLockMap.put(3, new Position(3,"Bad"));
        chestLockMap.put(4, new Position(4,"Very bad"));
        chestLockMap.put(5, new Position(5,"Very bad"));
        chestLockMap.put(6, new Position(6,"Very bad"));
        chestLockMap.put(7, new Position(7,"Bad"));
        chestLockMap.put(8, new Position(8,"good"));
        chestLockMap.put(9, new Position(9,"Very good"));
        chestLockMap.put(14, new Position(14,"Really close"));
        chestLockMap.put(11, new Position(11,"good"));
        chestLockMap.put(12, new Position(12,"Bad"));
        chestLockMap.put(13, new Position(13,"Bad"));
        chestLockMap.put(10, new Position(10,"Lock open, treasure gathered !"));

        chestLockMap.get(1).addMove("U", 4);
        chestLockMap.get(1).addMove("D", 7);
        chestLockMap.get(1).addMove("L", 2);
        chestLockMap.get(1).addMove("R", 6);

        chestLockMap.get(2).addMove("U", 3);
        chestLockMap.get(2).addMove("R", 1);

        chestLockMap.get(3).addMove("D", 2);
        chestLockMap.get(3).addMove("R", 4);
        chestLockMap.get(3).addMove("L", 8);

        chestLockMap.get(4).addMove("D", 1);
        chestLockMap.get(4).addMove("R", 5);
        chestLockMap.get(4).addMove("L", 3);

        chestLockMap.get(5).addMove("D", 6);
        chestLockMap.get(5).addMove("R", 13);
        chestLockMap.get(5).addMove("L", 4);

        chestLockMap.get(6).addMove("U", 5);
        chestLockMap.get(6).addMove("R", 1);
        chestLockMap.get(6).addMove("L", 12);

        chestLockMap.get(7).addMove("U", 1);
        chestLockMap.get(7).addMove("D", 11);
        chestLockMap.get(7).addMove("L", 8);

        chestLockMap.get(8).addMove("D", 9);
        chestLockMap.get(8).addMove("R", 7);
        chestLockMap.get(8).addMove("L", 3);

        chestLockMap.get(9).addMove("D", 14);
        chestLockMap.get(9).addMove("R", 11);

        chestLockMap.get(14).addMove("U", 9);
        chestLockMap.get(14).addMove("D", 2);
        chestLockMap.get(14).addMove("R", 10);

        chestLockMap.get(11).addMove("U", 7);
        chestLockMap.get(11).addMove("D", 13);
        chestLockMap.get(11).addMove("R", 12);
        chestLockMap.get(11).addMove("L", 9);

        chestLockMap.get(12).addMove("U", 13);
        chestLockMap.get(12).addMove("R", 6);
        chestLockMap.get(12).addMove("L", 11);

        chestLockMap.get(13).addMove("D", 12);
        chestLockMap.get(13).addMove("R", 5);
        chestLockMap.get(13).addMove("L", 11);

        return chestLockMap;
    }

}
