/*
 * 
 */

package org.usfirst.frc.team5275.robot.commands;

import org.usfirst.frc.team5275.robot.OI;
import org.usfirst.frc.team5275.robot.Robot;
import org.usfirst.frc.team5275.robot.subsystems.*;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class teleop extends Command {

    public teleop() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.drive);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
<<<<<<< HEAD
    	Robot.oi.leftS.getRawAxis(1);
    	Robot.oi.rightS.getRawAxis(1);
=======
    	//OI.leftS.getRawAxis(1);
    	//OI.rightS.getRawAxis(1);
>>>>>>> master
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
<<<<<<< HEAD
    	//this should give us the command-based mecanum drive we were looking for
//    	Robot.PWMDrive.mecanumDrive_Cartesian(Robot.oi.rightS.getX(), Robot.oi.rightS.getY(), Robot.oi.rightS.getTwist(),0);
   // 	triggerR.whenPressed(new reverse);
=======
    	//Robot.SRXrd.mecanumDrive_Cartesian(OI.rightS.getX(), OI.rightS.getY(), OI.rightS.getTwist(),0);
    	Robot.rd.mecanumDrive_Cartesian(.5*OI.rightS.getX(), .5*OI.rightS.getY(), .5*OI.rightS.getZ(),0);
    	
    	
>>>>>>> master
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
