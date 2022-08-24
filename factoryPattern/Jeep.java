package factoryPattern;

public class Jeep extends Cars{
    private String name;
    public Jeep(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
