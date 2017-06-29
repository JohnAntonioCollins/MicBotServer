package collins.john.model;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.RaspiPin;
import org.springframework.stereotype.Component;

/**
 * Created by johncollins on 3/7/17.
 */
/*
TODO: send LED status to front-end so UI stays in sync.
 */

@Component
public class MotorMover
{
    final GpioController gpio = GpioFactory.getInstance();

    final GpioPinDigitalOutput pin_00_LED = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_00, "MyLED");

    final GpioPinDigitalOutput pin_02_A_fwd = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_02, "motor_A_forward");
    final GpioPinDigitalOutput pin_03_A_rvrs = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_03, "motor_A_reverse");

    final GpioPinDigitalOutput pin_23_B_fwd = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_23, "motor_B_forward");
    final GpioPinDigitalOutput pin_24_B_rvrs = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_24, "motor_B_reverse");

    public String returnString(String userInput)
    {
        return "received String: " + userInput;
    }

    public void toggleLED()
    {
        System.out.println("_________________________________\n" + String.format("%s state is %s", pin_00_LED.getName(), pin_00_LED.getState()));
        pin_00_LED.toggle();
        System.out.println(String.format("%s state set to %s", pin_00_LED.getName(), pin_00_LED.getState()) + "\n");
    }

    public void motor_A_forward()
    {
        System.out.println("_________________________________\n" + String.format("%s state is %s", pin_02_A_fwd.getName(), pin_02_A_fwd.getState()));
        pin_02_A_fwd.pulse(500);
        System.out.println(String.format("%s state pulsed 500ms to %s", pin_02_A_fwd.getName(), pin_02_A_fwd.getState()) + "\n");
    }

    public void motor_A_reverse()
    {
        System.out.println("_________________________________\n" + String.format("%s state is%s", pin_03_A_rvrs.getName(), pin_03_A_rvrs.getState()));
        pin_03_A_rvrs.pulse(500);
        System.out.println(String.format("%s state pulsed 500ms to %s", pin_03_A_rvrs.getName(), pin_03_A_rvrs.getState()) + "\n");
    }

    public void motor_B_forward()
    {
        System.out.println("_________________________________\n" + String.format("%s state is%s", pin_23_B_fwd.getName(), pin_23_B_fwd.getState()));
        pin_23_B_fwd.pulse(500);
        System.out.println(String.format("%s state pulsed 500ms to %s", pin_23_B_fwd.getName(), pin_23_B_fwd.getState()) + "\n");
    }

    public void motor_B_reverse()
    {
        System.out.println("_________________________________\n" + String.format("%s state is%s", pin_24_B_rvrs.getName(), pin_24_B_rvrs.getState()));
        pin_24_B_rvrs.pulse(500);
        System.out.println(String.format("%s state pulsed 500ms to %s", pin_24_B_rvrs.getName(), pin_24_B_rvrs.getState()) + "\n");
    }

}
