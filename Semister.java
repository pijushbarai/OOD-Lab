import java.util.*;  
public class Semister {
    private int id;
    private String name;
    private List<Course> courses;

    //constructior 
    
    Semister(){
    }
    Semister(int id, String name){
        this.name = name;
        this.id = id;
    }
    //geter and seter
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }public void setName(String name) {
        this.name = name;
    }
    //methods in uml diagram
    public void freeze(){

    }
    public void attend(){

    }
    
}
