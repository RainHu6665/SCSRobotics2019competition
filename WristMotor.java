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
import frc.robot.commands.WristMotorStop;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class WristMotor extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  private final SpeedController wristMotor = RobotMap.wristMotor;

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new WristMotorStop());
  }


  public void wristMotorUp(){
    wristMotor.set(-0.65);
    // System.err.println("Motor Up");
  }

  public void wristMotorDown(){
    wristMotor.set(0.65);
    // System.err.println("Motor Down");
  }

  public void wristMotorStop(){
    wristMotor.set(0.0);
    // System.err.println("Motor Stop");
  }

}
