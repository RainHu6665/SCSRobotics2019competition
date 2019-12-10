/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.OI;
import frc.robot.Robot;
import frc.robot.RobotMap;

/**
 * An example command.  You can replace me with your own command.
 */
public class ArmMotorUp extends Command {

  public static OI oi;
  private final Encoder enc = RobotMap.enc;

  public ArmMotorUp() {
    // Use requires() here to declare subsystem dependencies
    requires(Robot.armMotor);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    // oi = new OI();
    // enc.reset();
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    Robot.armMotor.armMotorUp();
    int count = enc.get();
    System.err.println(count);
    // if (count < -200){
    //   Robot.motorTest.motorStop();
    // }
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.armMotor.armMotorStop();
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
