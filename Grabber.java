package org.firstinspires.ftc.team13180;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
@TeleOp
public class Grabber extends LinearOpMode{
    private DcMotor Rubber;
    private DcMotor Winch;
    private Servo Tilt1;
    private Servo Tilt2;
    @Override
    public void runOpMode(){
        Rubber = hardwareMap.get(DcMotor.class, "Rubber");
        Winch = hardwareMap.get(DcMotor.class, "Winch");
        Tilt1 = hardwareMap.get(Servo.class, "Tilt1");
        Tilt2 = hardwareMap.get(Servo.class, "Tilt1");

        waitForStart();
        double RbrPower=0;
        double WnchPower=0;
        double Rbrmultiplier=0.5;
        double Wnchmultiplier=0.5;
        while (opModeIsActive()){
            RbrPower=Rbrmultiplier*this.gamepad2.right_stick_y;
            Rubber.setPower(RbrPower);

            if (this.gamepad2.left_stick_y>0){
                Winch.setPower(WnchPower);
            }
            if(this.gamepad2.left_stick_y<0){
                Winch.setPower(-WnchPower);
            }
            Tilt1.setPosition(0);
            Tilt2.setPosition(0);
        if(gamepad2.dpad_up){
            Tilt1.setPosition(15);
            Tilt2.setPosition(15);

        }
        if(gamepad2.dpad_down){
            Tilt2.setPosition(-15);
            Tilt2.setPosition(-15);
        }
        }


