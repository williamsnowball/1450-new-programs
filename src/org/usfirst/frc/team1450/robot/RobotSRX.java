package org.usfirst.frc.team1450.robot;


import edu.wpi.first.wpilibj.CANTalon.ControlMode;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Joystick;
//import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SampleRobot;
//import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.CANTalon;


/**
 * This sample program shows how to control a motor using a joystick. In the operator
 * control part of the program, the joystick is read and the value is written to the motor.
 *
 * Joystick analog values range from -1 to 1 and speed controller inputs also range from -1
 * to 1 making it easy to work together. The program also delays a short time in the loop
 * to allow other threads to run. This is generally a good idea, especially since the joystick
 * values are only transmitted from the Driver Station once every 20ms.
 */
public class RobotSRX extends SampleRobot {
	
 //   private SpeedController motor;	// the motor to directly control with a joystick
    private Joystick stick;
    private CANTalon CANmotor1, CANmotor2, CANmotor3, CANmotor4;
	private final double k_updatePeriod = 0.005; // update every 0.005 seconds/5 milliseconds (200Hz)
	private RobotDrive MyRobotDrive;

    public RobotSRX() {
    	  CANmotor1 = new CANTalon(0);
    	  CANmotor2 = new CANTalon(1);
    	  CANmotor3 = new CANTalon(2);
    	  CANmotor4 = new CANTalon(3);
    	  CANmotor1.enableControl();
    	  CANmotor2.enableControl();
    	  CANmotor3.enableControl();
    	  CANmotor4.enableControl();
    	  CANmotor1.changeControlMode(ControlMode.PercentVbus);
    	  CANmotor2.changeControlMode(ControlMode.PercentVbus);
    	  CANmotor3.changeControlMode(ControlMode.PercentVbus);
    	  CANmotor4.changeControlMode(ControlMode.PercentVbus);
    	  MyRobotDrive = new RobotDrive(CANmotor1, CANmotor2, CANmotor3, CANmotor4);
 //       motor = new TalonSRX(0);		// initialize the motor as a Talon on channel 0
        stick = new Joystick(0);	// initialize the joystick on port 0
        
    }

    /**
     * Runs the motor from a joystick.
     */
    public void operatorControl() {
        while (isOperatorControl() && isEnabled()) {
        	// Set the motor's output.
        	// This takes a number from -1 (100% speed in reverse) to +1 (100% speed going forward)
        	MyRobotDrive.arcadeDrive(stick);
        	
            Timer.delay(k_updatePeriod);	// wait 5ms to the next update
        }
        
    }
}
