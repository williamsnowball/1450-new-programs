package Robot.Commands;

import Robot.Subsystems.*;
import RobotMain.OperatorInterface;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The base for all commands. All atomic commands should subclass CommandBase.
 * CommandBase stores creates and stores each control system.
 */
public abstract class CommandBase extends Command {

    public static OperatorInterface oi;

    // Create a single static instance of all of your subsystems
    public static DriveTrain driveTrain = new DriveTrain();
    
   
        oi = new OperatorInterface();

        // Show what command your subsystem is running on the SmartDashboard
        SmartDashboard.putData(driveTrain);
    }

    public CommandBase(String name) {
        super(name);
    }

    public CommandBase() {
        super();
    }
}