public class WalkBackward implements Iwork{
    private Robot robot;
    public WalkBackward(Robot robot){
        this.robot = robot;
    }
    @Override
    public void execute() {
        robot.walkBackward();
        // TODO Auto-generated method stub
        
    }
    
}
