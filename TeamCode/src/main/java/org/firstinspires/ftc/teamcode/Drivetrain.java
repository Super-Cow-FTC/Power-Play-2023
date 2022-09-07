package org.firstinspires.ftc.teamcode;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;

public class Drivetrain {
    private final MotorGroup right;
    private final MotorGroup left;

    public Drivetrain() {
        right = new MotorGroup(hardwareMap.dcMotor.get(Ports.UP_RIGHT_MOTOR.port), hardwareMap.dcMotor.get(Ports.DOWN_RIGHT_MOTOR.port));
        left = new MotorGroup(hardwareMap.dcMotor.get(Ports.UP_LEFT_MOTOR.port), hardwareMap.dcMotor.get(Ports.DOWN_RIGHT_MOTOR.port));
        left.reverse();
    }

    public void drive(double powerRight, double powerLeft) {
        right.setPower(powerRight);
        left.setPower(powerLeft);
    }

    public void stop() {
        right.stop();
        left.stop();
    }

    public double getRightPosition() {
        return right.getPosition();
    }

    public double getLeftPosition() {
        return left.getPosition();
    }

    public double getPosition() {
        return (getRightPosition() + getLeftPosition()) / 2;
    }

    public void resetRight() {
        right.resetEncoder();
    }

    public void resetLeft() {
        left.resetEncoder();
    }

    public void resetEncoder() {
        resetRight();
        resetLeft();
    }

    public MotorGroup getRight() {
        return right;
    }

    public MotorGroup getLeft() {
        return left;
    }
}
