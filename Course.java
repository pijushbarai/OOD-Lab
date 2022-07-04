import java.security.ProtectionDomain;

public class Course {
    protected int id;
    public String courseTitle;
    public String courseCode;

    public void  register(){
        System.out.println("Course is Resistered");
    }
    public void drop(){
        System.out.println("Course is droped");
    }
    public void withDraw(){
        System.out.println("Course is with drawed");
    }
}
