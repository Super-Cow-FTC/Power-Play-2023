package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

@Autonomous(name = "Moshe The Autonomous")
public class AutoOpMode extends OpMode {

    private Drivetrain drivetrain;


    @Override
    public void init() {
        drivetrain = new Drivetrain();
    }

    @Override
    public void start() {
        drivetrain.drive(0.5, 0.5);
    }

    @Override
    public void stop() {
        drivetrain.stop();
    }

    @Override
    public void loop() {
    }
}
