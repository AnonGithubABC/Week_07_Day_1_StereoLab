import java.util.ArrayList;

public class CDPlayer extends Component{


    private int capacity;
    private ArrayList<CDPlayer> cdPlayer;

    public CDPlayer(String makeName, String modelName, int capacity){
        super(makeName, modelName);
        this.capacity = capacity;
        this.cdPlayer = new ArrayList<>();
    }

    public String play(String format){
        return "I am Playing A " + format;
    }


}
