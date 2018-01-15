public class RecordDeck extends Component{

    public RecordDeck(String makeName, String modelName) {
        super(makeName, modelName);
    }


    public String play(String format){
        return "I am Playing A " + format;
    }

}
