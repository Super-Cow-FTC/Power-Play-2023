package org.firstinspires.ftc.teamcode;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous(name = "Encoder")
public class EncoderTrial extends OpMode {

    private Drivetrain drivetrain;


    @Override
    public void init() {
        drivetrain = new Drivetrain();
        MotorGroup right = new MotorGroup(hardwareMap.dcMotor.get(Ports.UP_RIGHT_MOTOR.port), hardwareMap.dcMotor.get(Ports.DOWN_RIGHT_MOTOR.port));
        MotorGroup left = new MotorGroup(hardwareMap.dcMotor.get(Ports.UP_LEFT_MOTOR.port), hardwareMap.dcMotor.get(Ports.DOWN_LEFT_MOTOR.port));
        left.reverse();
    }

    @Override
    public void start() {
        while ((drivetrain.getLeftPosition() + drivetrain.getRightPosition()) / 2 <= 900){
            drivetrain.drive(0.5,0.5);
        }

    }

    @Override
    public void stop() {
        drivetrain.stop();
    }

    @Override
    public void loop() {
    }
}
