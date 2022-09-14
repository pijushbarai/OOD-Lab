import java.util.ArrayList;
import java.util.List;


public class RobotController {
    private List<Iwork> workList = new ArrayList<Iwork>();

    public void takeCommand(Iwork work){
        workList.add(work);
    }

    public void executeCommand(){
        for(Iwork work: workList){
            work.execute();
        }
        workList.clear();
    }
}
