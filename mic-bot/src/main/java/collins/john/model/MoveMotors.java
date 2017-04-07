package collins.john.model;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.RaspiPin;
import org.springframework.stereotype.Component;

/**
 * Created by johncollins on 3/7/17.
 */
//TODO: get pulse duration from front-end in next sprint/version

@Component
public class MoveMotors
{


    // create gpio controller instance
    final GpioController gpio = GpioFactory.getInstance();
    //working test code
    //final GpioPinDigitalOutput myPin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_00, "MyLED");
    final GpioPinDigitalOutput myPin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_00, "MyLED");

    //hardware pin 13
    final GpioPinDigitalOutput pin02_A_fwd = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_02, "motor_A_forward");
    final GpioPinDigitalOutput pin03_A_rvrs = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_03, "motor_A_reverse");

    final GpioPinDigitalOutput pin22_B_fwd = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_22, "motor_B_forward");
    final GpioPinDigitalOutput pin23_B_rvrs = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_23, "motor_B_reverse");


    public String returnString(String userInput)
    {
        return "received String: " + userInput;
    }


    public void toggleLED()
    {
        System.out.println("_________________________________\n" + String.format("%s state is %s", myPin.getName(), myPin.getState()));
        myPin.toggle();
        System.out.println(String.format("%s state set to %s", myPin.getName(), myPin.getState()) + "\n");
    }

    public void motor_A_forward()
    {
        System.out.println("_________________________________\n" + String.format("%s state is %s", pin02_A_fwd.getName(), pin02_A_fwd.getState()));
        pin02_A_fwd.pulse(500);
        System.out.println(String.format("%s state set to %s", pin02_A_fwd.getName(), pin02_A_fwd.getState()) + "\n");
    }

    public void motor_A_reverse()
    {
        System.out.println("_________________________________\n" + String.format("%s state is%s", pin03_A_rvrs.getName(), pin03_A_rvrs.getState()));
        pin03_A_rvrs.pulse(500);
        System.out.println(String.format("%s state is set to %s", pin03_A_rvrs.getName(), pin03_A_rvrs.getState()) + "\n");

    }

    public void motor_B_forward()
    {
        System.out.println("_________________________________\n" + String.format("%s state is%s", pin22_B_fwd.getName(), pin22_B_fwd.getState()));
        pin22_B_fwd.pulse(500);
        System.out.println(String.format("%s state is set to %s", pin22_B_fwd.getName(), pin22_B_fwd.getState()) + "\n");

    }

    public void motor_B_reverse()
    {
        System.out.println("_________________________________\n" + String.format("%s state is%s", pin23_B_rvrs.getName(), pin23_B_rvrs.getState()));
        pin23_B_rvrs.pulse(500);
        System.out.println(String.format("%s state is set to %s", pin23_B_rvrs.getName(), pin23_B_rvrs.getState()) + "\n");

    }

    // configure the pin shutdown behavior; these settings will be
    // automatically applied to the pin when the application is terminated
    // ensure that the LED is turned OFF when the application is shutdown
    //myLed.setShutdownOptions(true,PinState.LOW,PinPullResistance.OFF);




}
