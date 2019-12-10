/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class DriveTrain extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  private final SpeedController motorLFront = RobotMap.motorLFront;
  private final SpeedController motorLBack = RobotMap.motorLBack;
  private final SpeedController motorRFront = RobotMap.motorRFront;
  private final SpeedController motorRBack = RobotMap.motorRBack;
  private final SpeedControllerGroup motorR = RobotMap.motorR;
  private final SpeedControllerGroup motorL = RobotMap.motorL;
  
  public final DifferentialDrive drive = RobotMap.driveTrain;

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  public void TakeJoystickInput (Joystick joystick){
    drive.arcadeDrive(-0.8*joystick.getY(), 0.7*joystick.getX());
  }

  public void StopDriving(){
    drive.arcadeDrive(0,0);
  }

}
