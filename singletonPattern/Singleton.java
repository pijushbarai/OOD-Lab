public class Singleton {
    private static Singleton ins;
    private Singleton(){
        System.out.println("Hi");
    }

    public static Singleton getInstance(){
        if(ins == null){
            ins = new Singleton();
        }
        return ins;
    }

    
}
