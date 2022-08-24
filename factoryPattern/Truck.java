package factoryPattern;

public class Truck extends Cars {
    private String name;
    public Truck(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    
}
