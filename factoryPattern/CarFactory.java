package factoryPattern;

public class CarFactory {
    public Cars getProduct(String product){
        if(product.equals("Beep")){
            return new Jeep();
        }else if(product.equals("Bus")){
            return new Bus();
        }else if (product.equals("Truck")){
            return new Truck();
        }

    }
    
}
