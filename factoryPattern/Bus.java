package factoryPattern;

public class Bus extends Cars{
    private String name;
    public Bus(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
