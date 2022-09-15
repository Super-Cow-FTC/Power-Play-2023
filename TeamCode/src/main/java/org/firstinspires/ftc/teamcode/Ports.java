package org.firstinspires.ftc.teamcode;

public enum Ports {
    UP_LEFT_MOTOR("UL"), UP_RIGHT_MOTOR("UR"), DOWN_LEFT_MOTOR("DL"), DOWN_RIGHT_MOTOR("DR");
    public final String port;

    Ports(String port) {
        this.port = port;
    }
}
