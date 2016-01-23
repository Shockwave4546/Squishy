package org.usfirst.frc.team4546.robot.subsystems;

import org.usfirst.frc.team4546.robot.RobotMap;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Cannon extends Subsystem {

	AnalogInput sonicSensor = RobotMap.cannonSonicSensor;
	
	protected void initDefaultCommand() {
		
		
	}

	public double getRawVoltage()	{
		
		return sonicSensor.getVoltage();
	}
}
