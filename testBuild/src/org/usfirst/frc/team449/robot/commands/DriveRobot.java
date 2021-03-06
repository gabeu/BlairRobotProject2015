package org.usfirst.frc.team449.robot.commands;

import org.usfirst.frc.team449.robot.Robot;
import org.usfirst.frc.team449.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveRobot extends Command {
	
	private double maxRPM = 1;

    public DriveRobot() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.drive);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.drive.setSpeed(0);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	double rpm = Robot.oi.getElevJoyY()* maxRPM * RobotMap.encoderPPR;
    	Robot.drive.setSpeed(rpm);
    	System.out.println("I set the fucking setpoint" + rpm);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
