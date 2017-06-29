package collins.john.controller;

import collins.john.model.CameraStreamer;
import collins.john.model.MotorMover;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by johncollins on 3/7/17.
 */
@RestController
public class RESTcontroller
{
    private MotorMover motorMover;
    private CameraStreamer cameraStreamer;

    @Autowired
    public RESTcontroller(MotorMover motorMover, CameraStreamer cameraStreamer)
    {
        this.motorMover = motorMover;
        this.cameraStreamer = cameraStreamer;
    }

    @RequestMapping(value = "/startCamera", method = RequestMethod.POST)
    public void startCamera(){
        cameraStreamer.streamVideo();
    }

    @RequestMapping(value = "/stopCamera", method = RequestMethod.POST)
    public void stopCamera(){
        cameraStreamer.stopStreaming();
    }

    @RequestMapping("/rsvp")
    public String rsvp(@RequestParam(value = "echo", defaultValue = "echo: default response") String echo)
    {
        return motorMover.returnString(echo);
    }

    @RequestMapping(value = "/toggleLED", method = RequestMethod.POST)
    public void toggleLED()
    {
        motorMover.toggleLED();
        System.out.println("controller says pin pi4J-00 / BCM-17 / physical-11 has been toggled.");
    }

    @RequestMapping(value = "/motor_A_forward", method = RequestMethod.POST)
    public void motor_A_forward()
    {
        motorMover.motor_A_forward();
        System.out.println("controller says pin pi4J-02 / BCM-27 / physical-13 pulsed for 500ms");
    }

    @RequestMapping(value = "/motor_A_reverse", method = RequestMethod.POST)
    public void motor_A_reverse()
    {
        motorMover.motor_A_reverse();
        System.out.println("controller says pin pi4J-03 / BCM-22 / physical-15 pulsed for 500ms");
    }

    @RequestMapping(value = "/motor_B_forward", method = RequestMethod.POST)
    public void motor_B_forward()
    {
        motorMover.motor_B_forward();
        System.out.println("controller says pin pi4J-23 / BCM-13 / physical-33 pulsed for 500ms");
    }

    @RequestMapping(value = "/motor_B_reverse", method = RequestMethod.POST)
    public void motor_B_reverse()
    {
        motorMover.motor_B_reverse();
        System.out.println("controller says pin pi4J-24 / BCM-19 / physical-35 pulsed for 500ms");
    }

}


