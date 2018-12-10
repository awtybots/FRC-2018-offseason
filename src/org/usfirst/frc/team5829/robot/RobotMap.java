/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team5829.robot;

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
	
	// Motors plz change to actual numbers
	// TODO add wheel motors
	public static int leftBackMotor = 1; // Talon
	public static int leftMiddleMotor = 2; // Talon
	public static int leftFrontMotor = 3; // Talon

	public static int rightBackMotor = 4; // Talon
	public static int rightMiddleMotor = 5; // Talon
	public static int rightFrontMotor = 6; // Talon
}