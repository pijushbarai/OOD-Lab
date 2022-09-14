public class WalkStop implements Iwork{
    private Robot robot;
    public WalkStop(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        robot.walkStop();
        // TODO Auto-generated method stub
        
    }
    
}
