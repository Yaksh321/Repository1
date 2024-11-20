// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.SparkPIDController;
import com.revrobotics.CANSparkLowLevel.MotorType;

public class ExampleSubsystem extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  CANSparkMax motorOne;
  CANSparkMax motorFront;
  CANSparkMax motorBack;
  int neGus;
  PIDController PIDZ;
  RelativeEncoder EncoderZ;

  double inputPID;
  double outputPID;
  
  public ExampleSubsystem() {
    motorOne = new CANSparkMax(16, MotorType.kBrushless);
    EncoderZ = motorOne.getEncoder();
    EncoderZ.setPosition(0);
 
    neGus = -1;

    PIDZ = new PIDController(0,0,0);
  }

    public void runMotorOne(double speed) {
      motorOne.set(PIDZ.calculate(EncoderZ.getPosition(), 0));

      System.out.println(EncoderZ.getPosition());
    }
    
    public void stopMotorOne() {
      motorFront.stopMotor();
      motorOne.stopMotor();
    }
  
  
    
  

public void runShooterMotors (double speed) {

}




   

  
  
  
  
  
  }

