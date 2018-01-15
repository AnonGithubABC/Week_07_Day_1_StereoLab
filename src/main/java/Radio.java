public class Radio extends Component{


    public Radio(String makeName, String modelName) {
        super(makeName, modelName);

    }

    public String tune(String station){
        return station;
    }

    public String play(String format){
        return "I am Playing A " + format;
    }
}
