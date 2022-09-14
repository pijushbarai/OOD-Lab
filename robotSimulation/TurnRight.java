public class TurnRight implements Iwork {
    private Robot robot;
    public TurnRight(Robot robot){
        this.robot = robot;
    }
    @Override
    public void execute() {
        robot.turnRight();
        // TODO Auto-generated method stub
        
    }
    
}
