package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;

//This is the Buttons and Commands file

public class RobotContainer {


  public RobotContainer() {
  //This will be your standard drive command - Get Joystick Value, Plug Into drive command, Profit

  //Runs the configureButtonBindings Function made below to setup all the buttons. Hints the name
    configureButtonBindings();
  }

/*
Here you will use the IDs from the constants folder to actually create all the buttons for each of the controllers and eventually 
make them linked to various commands. I recommend going to previous programs and copy pasting the constructors for this because it is
very tedious
*/
  private void configureButtonBindings() {
    //In these brackets put the afformentioned constructors and all of the rTrigger.whenheld(new ShooterOn()) stuff

  }

/* 
This function simply runs a command of your choosing during autonomous. Just replace 'null' with the name of the command
Example:  return AutoDrive();
*/
  public Command getAutonomousCommand() {
    return null;
  }
}
