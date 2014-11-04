/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package com.team449.frc2015;


import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import com.team449.frc2015.commands.CommandBase;
import com.team449.frc2015.commands.TeleopDriveCommand;
import edu.wpi.first.wpilibj.Compressor;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class TestCoast extends IterativeRobot {

    Command autonomousCommand;
    Command driveCommand;
    Compressor compressor;

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
        System.out.println("ROBOT INIT");
        
        // instantiate the command used for the autonomous period
        //autonomousCommand = new ExampleCommand();
        driveCommand = new TeleopDriveCommand();

        // Initialize all subsystems
        CommandBase.init();
        compressor = new Compressor(RobotMap.p_switch, RobotMap.c_spike);
        compressor.start();//starts the compressor
    }

    public void autonomousInit() {
        System.out.println("AUTONOMOUS INIT");
        // schedule the autonomous command (example)
        //autonomousCommand.start();
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
        //autonomousCommand.cancel();
        System.out.println("TELEOP INIT");
        driveCommand.start();
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
        System.out.println("joystick positions: "+
                CommandBase.oi.getJ1Axis()+" "+CommandBase.oi.getJ2Axis());
    }
    
    public void disabledInit() {
        driveCommand.cancel();
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
}
