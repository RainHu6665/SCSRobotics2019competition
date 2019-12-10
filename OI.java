/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.ArmMotorDown;
import frc.robot.commands.ArmMotorStop;
import frc.robot.commands.ArmMotorUp;
// import frc.robot.commands.OpenHatch;
// import frc.robot.commands.CloseHatch;
import frc.robot.commands.RollerLeftMotorIn;
import frc.robot.commands.RollerLeftMotorOut;
import frc.robot.commands.RollerLeftMotorStop;
// import frc.robot.commands.RollerRightMotorIn;
// import frc.robot.commands.RollerRightMotorOut;
// import frc.robot.commands.RollerRightMotorStop;
import frc.robot.commands.WristMotorDown;
import frc.robot.commands.WristMotorStop;
import frc.robot.commands.WristMotorUp;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  //// CREATING BUTTONS
  // One type of button is a joystick button which is any button on a
  //// joystick.
  // You create one by telling it which joystick it's on and which button
  // number it is.
  // Joystick stick = new Joystick(port);
  // Button button = new JoystickButton(stick, buttonNumber);

  // There are a few additional built in buttons you can use. Additionally,
  // by subclassing Button you can create custom triggers and bind those to
  // commands the same as any other Button.

  //// TRIGGERING COMMANDS WITH BUTTONS
  // Once you have a button, it's trivial to bind it to a button in one of
  // three ways:

  // Start the command when the button is pressed and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenPressed(new ExampleCommand());

  // Run the command while the button is being held down and interrupt it once
  // the button is released.
  // button.whileHeld(new ExampleCommand());

  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new ExampleCommand());

  public Joystick joystick;

  public JoystickButton armMotorUpButton;
  public JoystickButton armMotorDownButton;
  public JoystickButton armMotorStopButton;

  public JoystickButton wristMotorUpButton;
  public JoystickButton wristMotorDownButton;
  public JoystickButton wristMotorStopButton;

  public JoystickButton rollerLeftMotorInButton;
  public JoystickButton rollerLeftMotorOutButton;
  public JoystickButton rollerLeftMotorStopButton;

  // public JoystickButton rollerRightMotorInButton;
  // public JoystickButton rollerRightMotorOutButton;
  // public JoystickButton rollerRightMotorStopButton;

  // public JoystickButton openHatchButton;
  // public JoystickButton closeHatchButton;


  public int armMotorUpButtonNumber = 4;
  public int armMotorDownButtonNumber = 6;
  // public int armMotorStopButtonNumber = 5;

  public int wristMotorUpButtonNumber = 7;
  public int wristMotorDownButtonNumber = 8;
  // public int wristMotorStopButtonNumber = 9;

  public int rollertMotorInButtonNumber = 1;
  public int rollerMotorOutButtonNumber = 2;
  public int rollerMotorStopButtonNumber = 3;

  // public int openHatchButtonNumber = 11;
  // public int closeHatchButtonNumber = 12;

  public OI(){
    joystick = new Joystick(0);
    // openHatchButton = new JoystickButton(joystick, openHatchButtonNumber);
    // openHatchButton.whenPressed(new OpenHatch());
    // closeHatchButton = new JoystickButton(joystick,closeHatchButtonNumber);
    // closeHatchButton.whenPressed(new CloseHatch());
    
    armMotorUpButton = new JoystickButton(joystick, armMotorUpButtonNumber);
    armMotorUpButton.whileHeld(new ArmMotorUp());
    armMotorDownButton = new JoystickButton(joystick, armMotorDownButtonNumber);
    armMotorDownButton.whileHeld(new ArmMotorDown());
    // armMotorStopButton = new JoystickButton(joystick, armMotorUpButtonNumber);
    // armMotorStopButton = new JoystickButton(joystick, armMotorDownButtonNumber);
    // armMotorStopButton.whenReleased(new ArmMotorStop());

    wristMotorUpButton = new JoystickButton(joystick, wristMotorUpButtonNumber);
    wristMotorUpButton.whileHeld(new WristMotorUp());
    wristMotorDownButton = new JoystickButton(joystick, wristMotorDownButtonNumber);
    wristMotorDownButton.whileHeld(new WristMotorDown());
    // wristMotorStopButton = new JoystickButton(joystick, wristMotorUpButtonNumber);
    // wristMotorStopButton = new JoystickButton(joystick, wristMotorDownButtonNumber);
    // wristMotorStopButton.whenPressed(new WristMotorStop());

    rollerLeftMotorOutButton = new JoystickButton(joystick, rollerMotorOutButtonNumber);
    rollerLeftMotorOutButton.whileHeld(new RollerLeftMotorOut());
    rollerLeftMotorInButton = new JoystickButton(joystick, rollertMotorInButtonNumber);
    rollerLeftMotorInButton.whenPressed(new RollerLeftMotorIn());
    rollerLeftMotorStopButton = new JoystickButton(joystick, rollerMotorStopButtonNumber);
    rollerLeftMotorStopButton.whenPressed(new RollerLeftMotorStop());

    // rollerRightMotorOutButton = new JoystickButton(joystick,rollerMotorOutButtonNumber);
    // rollerRightMotorOutButton.whenPressed(new RollerRightMotorIn());
    // rollerRightMotorInButton = new JoystickButton(joystick, rollertMotorInButtonNumber);
    // rollerRightMotorInButton.whenPressed(new RollerRightMotorOut());
    // rollerRightMotorStopButton = new JoystickButton(joystick,rollerMotorStopButtonNumber);
    // rollerRightMotorStopButton.whenPressed(new RollerRightMotorStop());

  }

  public Joystick getJoystick(){
    return joystick;
  }
}
