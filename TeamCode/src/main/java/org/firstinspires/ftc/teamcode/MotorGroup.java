package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

import java.util.Arrays;
import java.util.List;

public class MotorGroup {
    private final List<DcMotor> motors;
    private double currentSpeed = 0;

    public MotorGroup(DcMotor... motors) {
        this.motors = Arrays.asList(motors);
    }

    public void setPower(double power) {
        currentSpeed = power;
        for (DcMotor motor : motors) {
            motor.setPower(power);
        }
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setDirection(DcMotorSimple.Direction dir) {
        for (DcMotor motor : motors) {
            motor.setDirection(dir);
        }
    }

    public void stop() {
        for (DcMotor motor : motors) {
            motor.setPower(0);
        }
    }

    public List<DcMotor> getMotors() {
        return this.motors;
    }

    public void addMotor(DcMotor motor) {
        motors.add(motor);
        motor.setPower(currentSpeed);
    }

    public void reverse() {
        setDirection(DcMotorSimple.Direction.REVERSE);
    }

    public double getPosition() {
        double positionSum = 0;
        for (DcMotor motor : motors) {
            positionSum += motor.getCurrentPosition();
        }
        return positionSum / motors.size();
    }

    public void resetEncoder() {
        for (DcMotor motor : motors) {
            DcMotor.RunMode mode = motor.getMode();
            motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            motor.setMode(mode);
        }
    }

    public void removeMotor(DcMotor motor) {
        motors.remove(motor);
    }
}
