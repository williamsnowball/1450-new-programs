package RobotMain;

import Robot.Commands.CommandBase;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Scheduler;
import Robot.Commands.Autonomous.AutonomousBase;
/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the SimpleRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class BotMain extends IterativeRobot {

    AutonomousBase auto = new AutonomousBase();
    Compressor compressor = new Compressor(IODefines.PRESSURE_SWITCH,IODefines.COMPRESSOR_POWER);
    
    public void robotInit() {
        
       
    }
    public void autonomousInit() {
        // schedule the autonomous command (example)
       // autoCommand.start();
        auto.start();
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
        // This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to
        // continue until interrupted by another command, remove
        // this line or comment it out.
       //autoCommand.cancel();
       
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();