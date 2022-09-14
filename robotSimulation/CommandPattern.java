import java.awt.event.KeyAdapter;              
import java.awt.event.KeyEvent;


public class CommandPattern {
    public static void main(String[] args) {
        Robot robot = new Robot();

        WalkBackward wBackward = new WalkBackward(robot);
        WalkForward wForward = new WalkForward(robot);
        TurnLeft tLeft = new TurnLeft(robot);
        TurnRight tRight = new TurnRight(robot);
        WalkStop wStop = new WalkStop(robot);

        RobotController rc = new RobotController();
        rc.takeCommand(wBackward);
        rc.takeCommand(wForward);
        rc.takeCommand(tLeft);
        rc.takeCommand(tRight);
        rc.takeCommand(wStop);

        rc.executeCommand();
    }
}