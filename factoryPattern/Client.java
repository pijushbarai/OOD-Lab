package factoryPattern;

public class Client {
    public static void main(String[] args) {
        CarFactory factory = new CarFactory();

        Cars jeep = factory.getProduct("Jeep");
        Cars bus = factory.getProduct("Bus");
        
    }
}
