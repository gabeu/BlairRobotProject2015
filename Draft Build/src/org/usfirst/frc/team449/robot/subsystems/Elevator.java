package org.usfirst.frc.team449.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * The Elevator subsystem.
 */
public class Elevator extends Subsystem {

	private DigitalInput topLimit, bottomLimit;
	private DigitalInput leftArmLimit, rightArmLimit;
	private Solenoid leftSol, rightSol;
	private Victor[] motors = new Victor[2];
	private Encoder encoder;
	
	/**
	 * Elevator constructor
	 */
	public Elevator() {
		topLimit = new DigitalInput(1);
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void toggleArms(){
    	//toggles open/close state of arms
    	
    }
    
    public void releaseBreak(){
    	
    }
    
    public void setBrake(){
    	
    }
    
    public void setMotorSpeed(double speed){
    	
    }
    
    public void resetEncoder(){
    	
    }
}
