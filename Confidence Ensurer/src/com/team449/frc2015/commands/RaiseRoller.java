/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.team449.frc2015.commands;

/**
 *
 * @author Harrison
 */
public class RaiseRoller extends CommandBase {
    
    public RaiseRoller() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(roller);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        roller.retract_pistons();
        roller.setRollerMotor(0);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
        roller.retract_pistons();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
