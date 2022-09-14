public class WalkForward implements Iwork{

    private Robot robot;
    public WalkForward(Robot robot){
        this.robot = robot;
    }
    @Override
    public void execute() {
        // TODO Auto-generated method stub
        robot.walkForward();
    }
    
}
