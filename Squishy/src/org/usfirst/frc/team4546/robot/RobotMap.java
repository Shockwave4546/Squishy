package org.usfirst.frc.team4546.robot;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
	
	public static Talon drivetrainLeft;
	public static Talon drivetrainRight;
	public static RobotDrive drivetrainChassis;
	public static AnalogInput cannonSonicSensor;
	
	public static void init()	{
		
		drivetrainLeft = new Talon(0);
		drivetrainRight = new Talon(1);
		
		drivetrainChassis = new RobotDrive(drivetrainLeft, drivetrainRight);
		
		drivetrainChassis.setSafetyEnabled(true);
		drivetrainChassis.setExpiration(0.1);
        drivetrainChassis.setSensitivity(0.5);
        drivetrainChassis.setMaxOutput(1.0);
        
        drivetrainChassis.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
        
        cannonSonicSensor = new AnalogInput(0);
	}
	
}
