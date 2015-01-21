
/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OperatorInterface {
    // The right joystick is the driving joystick
    Joystick rightJoystick = new Joystick(1);
  \
    public OperatorInterface() {
        cameraLights.whenPressed(null);
       }

    public double getDriveRotation() {
        //return -leftJoystick.getX();      //BL commented this out to switch to XBox Controller
        return -leftJoystick.getRawAxis(1);
    }

    public double getDriveThrottle() {
        //return leftJoystick.getY();       //BL commented this out to switch to XBox Controller
        return leftJoystick.getRawAxis(2);
    }