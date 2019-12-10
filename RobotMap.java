/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

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

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;

  public static DifferentialDrive driveTrain;
  public static UsbCamera camera1;
  public static UsbCamera camera2;
  public static Compressor aCompressorCompressor;

  public static Encoder enc;
  
  public static SpeedController motorLFront;
  public static SpeedController motorRFront;
  public static SpeedController motorLBack;
  public static SpeedController motorRBack;
  public static SpeedControllerGroup motorL;
  public static SpeedControllerGroup motorR;

  public static SpeedController armMotor;
  public static SpeedController wristMotor;
  public static SpeedController rollerLeftMotor;
  public static SpeedController rollerRightMotor;
  public static DoubleSolenoid hatchConeSolenoid;

  
  public static int motorLFrontPort = 0;
  public static int motorLBackPort = 1;
  public static int motorRFrontPort = 2;
  public static int motorRBackPort = 3;

  public static int armMotorPort = 5;
  public static int wristMotorPort = 7;
  public static int rollerLeftMotorPort = 4;
  // public static int rollerRightMotorPort = 6;

  /*
  1. RobotMap - declare motors/solenoid as it is on the wiring board/roboRio
  2. Subsystem - make methods & set speed for motor/direction for solenoid
  3. Robot - declare the subsystem
  4. Command - requires subsystem & execute: use method from subsystem
  5. OI - declare your joystick button number
  */

  public static void init(){
      motorLFront = new Spark(motorLFrontPort);
      motorLFront.setInverted(false); 
      motorLBack = new Spark(motorLBackPort);
      motorLBack.setInverted(false);
      motorRFront = new Spark(motorRFrontPort);
      motorRFront.setInverted(false);
      motorRBack = new Spark(motorRBackPort);
      motorRBack.setInverted(false);
    
      motorL = new SpeedControllerGroup(motorLFront, motorLBack);
      motorR = new SpeedControllerGroup(motorRFront, motorRBack);

      driveTrain = new DifferentialDrive(motorL, motorR);
      driveTrain.setSafetyEnabled(true);
      driveTrain.setExpiration(0.1);
      driveTrain.setMaxOutput(1.0);
      
      aCompressorCompressor = new Compressor(0);
      hatchConeSolenoid = new DoubleSolenoid(0, 1);

      armMotor = new Spark(armMotorPort);
      armMotor.setInverted (false);
      wristMotor = new Spark(wristMotorPort);
      wristMotor.setInverted (false);
      rollerLeftMotor = new Spark(rollerLeftMotorPort);
      rollerLeftMotor.setInverted (false);
      // rollerRightMotor = new Spark(rollerRightMotorPort);
      // rollerRightMotor.setInverted(false);
      
      enc = new Encoder(0, 1, false, Encoder.EncodingType.k4X);
      // enc.setMaxPeriod(.1);
      // enc.setMinRate(10);
      // enc.setDistancePerPulse(5);
      // enc.setReverseDirection(true);
      // enc.setSamplesToAverage(7);

      // enc.reset();

      // int count = enc.get(); //current count, reset by reset()
      // System.err.println(count);
      // double raw = enc.getRaw(); //count w/o scale
      // double distance = enc.getDistance(); //current distance reading from the counter
      // double period = enc.getPeriod(); //current period of the counter
      // double rate = enc.getRate(); //rate of counter in unit/s
      // boolean direction = enc.getDirection(); //direction of the last value change, true = up
      // boolean stopped = enc.getStopped(); //currently stopped? period has exceeded Max Period

  }
}
