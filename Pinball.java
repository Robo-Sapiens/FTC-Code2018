package org.firstinspires.ftc.team13180;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
//import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
//import org.firstinspires.ftc.team13180.LoaderArm;
//import org.firstinspires.ftc.teamcode.ManualOpMode13180;

/**
 * Created by Shivam Adeshara on 7/13/2018.
 */
@TeleOp
//public class Pinball extends ManualOpMode13180 {
public class Pinball extends LinearOpMode {
    private Servo leftServo;
    private Servo rightServo;


    @Override
    public void runOpMode() {
        //imu = hardwareMap.get(Gyroscope.class, "imu");
        leftServo = hardwareMap.get(Servo.class, "leftServo");
        rightServo = hardwareMap.get(Servo.class, "rightServo");
        //servoTest2 = hardwareMap.get(Servo.class, "servoTest2");

        // TODO: If we comment this line, then we need to change
        // leftMote set[power to + instead of -
        // Do after Saturday game
        // One more direction is set to REVERSE
        // leftMotor.setDirection(DcMotor.Direction.REVERSE);

        waitForStart();

        while (opModeIsActive()) {
            // TODO: If we comment this line, then we need to change

            // leftMote set[power to + instead of -
            // Do after Saturday game
            // One more direction is set to REVERSE
            // leftMotor.setDirection(DcMotor.Direction.REVERSE);
            if (gamepad1.left_bumper) {
                // move to 0 degrees.
                leftServo.setPosition(0.5);
                rightServo.setPosition(0.75);
            } else if (gamepad1.right_bumper) {
                leftServo.setPosition(0);
                rightServo.setPosition(0.25);
            }
            telemetry.addData("Status ",  "Running");
            telemetry.update();
        }
        telemetry.addData("Status ",  "Done");
        telemetry.update();
    }
}