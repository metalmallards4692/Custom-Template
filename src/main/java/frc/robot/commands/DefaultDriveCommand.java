// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drivetrain;

public class DefaultDriveCommand extends CommandBase {
/* This is a command. Pretty much what these do is take a function from a subsystem and do some stuff to it. 

This command will take the drive command from the Drivetrain subsystem 
*/

Drivetrain m_drivetrainSubsystem;

  public DefaultDriveCommand(Drivetrain drivetrainSubsystem) {
    this.m_drivetrainSubsystem = drivetrainSubsystem;
// As the name implies, if the command uses a subsystem, you must add a requirenment for it to work.
    addRequirements(m_drivetrainSubsystem);
  }

  @Override
  public void initialize() {
  /*
  The premade comments are not completely clear, so I will make it a bit more understandbale. 
  Anything within these brackets will only run once each time the command is called. 
  */
 }

  @Override
  public void execute() {
  // Anything within these brackets will run constantly until the command ends
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  // Anything in here will run when the command is ended. Normally you want to set motors back to zero so they don't run forever. 
  }

  
  
  @Override
  public boolean isFinished() {
  /* 
  Returns true when the command should end.
  In other terms, you can set more conditions for the command to end automatically. Example is the index sensor reading or a timer value
  Just remove the false and put something like timer > 3 or you can do false || timer > 3. This means button not being held OR timer reached 3 seconds.
  */
    return false;
  }
}
