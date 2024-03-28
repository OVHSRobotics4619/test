package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

/** A hatch mechanism actuated by a single {@link DoubleSolenoid}. */
public class FlapSubsystem extends SubsystemBase {
  private TalonSRX flapMotor = new TalonSRX(22);

  public FlapSubsystem() {
  }

  public void enableFlap() {
    flapMotor.set(TalonSRXControlMode.PercentOutput, 0.35);
  }

  public void powerFlap() {
    flapMotor.set(TalonSRXControlMode.PercentOutput, 0.5);
  }

  public void reverseFlap() {
    flapMotor.set(TalonSRXControlMode.PercentOutput, -0.15);
  }

  public void disableFlap() {
    flapMotor.set(TalonSRXControlMode.PercentOutput, 0);
  }
}