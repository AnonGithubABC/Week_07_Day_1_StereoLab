public abstract class Component {

    private String makeName;
    private String modelName;


    public Component(String makeName, String modelName){
        this.makeName = makeName;
        this.modelName = modelName;

    }

    public String getmakeName() {
        return this.makeName;
    }

    public String getmodelName() {
        return this.modelName;
    }

    public abstract String play(String format);

}
