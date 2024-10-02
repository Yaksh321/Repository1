// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

public class ExampleSubsystem extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  CANSparkMax motorOne;
  CANSparkMax motorFront;
  CANSparkMax motorBack;
  int neGus;
  
  public ExampleSubsystem() {
    motorOne = new CANSparkMax(14, MotorType.kBrushless);
    motorFront = new CANSparkMax(11, MotorType.kBrushless);
 
    neGus = -1;
  }

    public void runMotorOne(double speed) {
      motorOne.set(speed);

    }
    
    public void stopMotorOne() {
      motorFront.stopMotor();
      motorOne.stopMotor();
    }
  
  
    
  

public void runShooterMotors (double speed) {

  motorOne.set(speed * neGus);

  motorFront.set(speed * neGus);

  neGus = neGus * -1;


}
  }

