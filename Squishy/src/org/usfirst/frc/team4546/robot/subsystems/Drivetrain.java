package org.usfirst.frc.team4546.robot.subsystems;

import org.usfirst.frc.team4546.robot.RobotMap;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team4546.robot.*;
import org.usfirst.frc.team4546.robot.commands.*;

public class Drivetrain extends Subsystem	{

	Talon left = RobotMap.drivetrainLeft;
	Talon right = RobotMap.drivetrainRight;
	RobotDrive chassis = RobotMap.drivetrainChassis;
	
	protected void initDefaultCommand() {

		setDefaultCommand(new Drive(Robot.oi.getDriveStick()));
	}
	
	public void drive(double magnitude, double rotate, double speed)	{
		
		chassis.arcadeDrive(magnitude*speed, rotate*speed);
	}
	

}
