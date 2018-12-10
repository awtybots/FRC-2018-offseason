/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team5829.robot.subsystems;

import org.usfirst.frc.team5829.robot.RobotMap;
import org.usfirst.frc.team5829.robot.commands.SplitArcade;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class DriveTrain extends Subsystem {
	public static TalonSRX leftBackMotor = new TalonSRX(RobotMap.leftBackMotor);
	public static TalonSRX leftMiddleMotor = new TalonSRX(RobotMap.leftMiddleMotor);
	public static TalonSRX leftFrontMotor = new TalonSRX(RobotMap.leftFrontMotor);
	public static TalonSRX rightBackMotor = new TalonSRX(RobotMap.rightBackMotor);
	public static TalonSRX rightMiddleMotor = new TalonSRX(RobotMap.rightMiddleMotor);
	public static TalonSRX rightFrontMotor = new TalonSRX(RobotMap.rightFrontMotor);
	
	public static double leftSpeed = .45;
	public static double rightSpeed = .45;
	
	public void initDefaultCommand() {
		setDefaultCommand(new SplitArcade());
	}
    public static void SplitArcade(double straight, double rotate) {	
    	leftFrontMotor.set(ControlMode.PercentOutput,(straight + rotate));
    	leftMiddleMotor.set(ControlMode.PercentOutput,(straight + rotate));
    	leftBackMotor.set(ControlMode.PercentOutput,(straight + rotate));
    	rightFrontMotor.set(ControlMode.PercentOutput,(straight - rotate));
    	rightMiddleMotor.set(ControlMode.PercentOutput,(straight - rotate));
    	rightBackMotor.set(ControlMode.PercentOutput,(straight - rotate));
    }
}
