/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.ArmMotorStop;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class ArmMotor extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  private final SpeedController armMotor = RobotMap.armMotor;

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new ArmMotorStop());
  }


  public void armMotorUp(){
    armMotor.set(0.65);
    // System.err.println("Motor Up");
  }


  public void armMotorDown(){
    armMotor.set(-0.65);
    // System.err.println("Motor Down");
  }

  public void armMotorStop(){
    armMotor.set(0.0);
  }

}
