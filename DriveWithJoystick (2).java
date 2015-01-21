package Robot.Commands.Drive;

import Robot.Commands.CommandBase;
/**
 */
public class DriveWithJoystick extends CommandBase {

    //public DriveEncoders Encoders = new DriveEncoders();
    //public Gyro Gyroscope = new Gyro(1);
    public DriveWithJoystick() {
        requires(driveTrain);
        //Encoders.LeftEncoder.setDistancePerPulse(Constants.Drives.distancePerPulse);
        //Encoders.start();
        
    }

    protected void initialize() {
    }

    protected void execute() {
        driveTrain.arcadeDrive(oi.getDriveThrottle()*-0.75, oi.getDriveRotation()*0.75);
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {