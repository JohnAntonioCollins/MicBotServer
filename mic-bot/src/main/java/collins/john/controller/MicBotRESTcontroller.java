package collins.john.controller;

import collins.john.model.MicbotCamera;
import collins.john.model.MoveMotors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by johncollins on 3/7/17.
 */
@RestController
public class MicBotRESTcontroller
{
    private MoveMotors moveMotors;
    private MicbotCamera micbotCamera;

    @Autowired
    public MicBotRESTcontroller(MoveMotors moveMotors, MicbotCamera micbotCamera)
    {
        this.moveMotors = moveMotors;
        this.micbotCamera = micbotCamera;
        //this.micbotCamera.streamVideo();
    }

    //TESTING METHOD NOW SHOULD GET ONE STILL ONCE
//    @RequestMapping(value = "/getImage", method = RequestMethod.GET)
//    public ResponseEntity<byte[]> getImage()
//    {
//        byte[] image = micbotCamera.serveMyImage();
//        return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(image);
//    }

    @RequestMapping(value = "/startCamera", method = RequestMethod.POST)
    public void startCamera(){
        micbotCamera.streamVideo();
    }

    @RequestMapping(value = "/stopCamera", method = RequestMethod.POST)
    public void stopCamera(){
        micbotCamera.stopStreaming();
    }

    @RequestMapping("/rsvp")
    public String rsvp(@RequestParam(value = "thing", defaultValue = "nada") String thing)
    {
        return moveMotors.returnString(thing);
    }

    @RequestMapping(value = "/toggleLED", method = RequestMethod.POST)
    public void toggleLED()
    {
        moveMotors.toggleLED();
        System.out.println("controller says pin 00 has been toggled.");
    }

    @RequestMapping(value = "/motor_A_forward", method = RequestMethod.POST)
    public void motor_A_forward()
    {
        moveMotors.motor_A_forward();
        System.out.println("controller says pin 02 pulsed for 500ms");
    }

    @RequestMapping(value = "/motor_A_reverse", method = RequestMethod.POST)
    public void motor_A_reverse()
    {
        moveMotors.motor_A_reverse();
        System.out.println("controller says pin 03 pulsed for 500ms");
    }

    @RequestMapping(value = "/motor_B_forward", method = RequestMethod.POST)
    public void motor_B_forward()
    {
        moveMotors.motor_B_forward();
        System.out.println("controller says pin 22 pulsed for 500ms");

    }

    @RequestMapping(value = "/motor_B_reverse", method = RequestMethod.POST)
    public void motor_B_reverse()
    {
        moveMotors.motor_B_reverse();
        System.out.println("controller says pin 23 pulsed for 500ms");

    }


}


