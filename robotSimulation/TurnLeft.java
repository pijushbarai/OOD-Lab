public class TurnLeft implements Iwork{
    private Robot robot;
    public TurnLeft(Robot robot){
        this.robot = robot;
    }
    @Override
    public void execute() {
        robot.turnLeft();
        // TODO Auto-generated method stub
        
    }
    
}
