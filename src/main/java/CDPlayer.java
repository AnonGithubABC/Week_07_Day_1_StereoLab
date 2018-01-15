import java.util.ArrayList;

public class CDPlayer {

    private String makeName;
    private String modelName;
    private int capacity;
    private ArrayList<CDPlayer> cdPlayer;

    public CDPlayer(String makeName, String modelName, int capacity){

        this.makeName = makeName;
        this.modelName = modelName;
        this.capacity = capacity;
        this.cdPlayer = new ArrayList<>();
    }


    public String getmakeName() {
        return this.makeName;
    }

    public String getmodelName() {
        return this.modelName;
    }
}
