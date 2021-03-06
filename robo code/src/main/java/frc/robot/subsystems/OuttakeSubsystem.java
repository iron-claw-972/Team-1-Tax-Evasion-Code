/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.revrobotics.CANSparkMax;

import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import frc.robot.Constants.OuttakeConstants;

public class OuttakeSubsystem extends SubsystemBase {
  TalonSRX motorSpinner = new TalonSRX(OuttakeConstants.kMotorSpinnerPort);

  public OuttakeSubsystem() {
    motorSpinner.setInverted(true);
  }

  public void run(double throttle) {
    motorSpinner.set(ControlMode.PercentOutput, throttle);
    }
}