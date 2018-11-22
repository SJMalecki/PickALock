package pickALock;

import java.util.HashMap;
import java.util.Map;

public class Position {

    private final int positionID;
    private final String description;
    private final Map<String, Integer> moves;

    public Position(int positionID, String description){
        this.positionID = positionID;
        this.description = description;
        this.moves = new HashMap<>();
        this.moves.put("Q", 0);
    }

    public void addMove(String direction, int contactPoint){
        this.moves.put(direction, contactPoint);
    }

    public int getPositionID() {
        return positionID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getMoves() {
        return new HashMap<>(moves);
    }
}
