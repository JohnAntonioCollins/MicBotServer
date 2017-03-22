package collins.john.model;

import com.pi4j.io.gpio.*;
import org.springframework.stereotype.Component;

/**
 * Created by johncollins on 3/7/17.
 */
@Component
public class MoveMotors
{


    // create gpio controller instance
    final GpioController gpio = GpioFactory.getInstance();

    // provision gpio pin #01 as an output pin and turn on
    final GpioPinDigitalOutput pin00 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_00, "MyLED");

    private String buttonPush;

//    public MoveMotors(String buttonPush)
//    {
//        this.buttonPush = buttonPush;
//    }

    public String returnString(String userInput)
    {
        return "received String: " + userInput;
    }

    public void gpioPinTest()
    {
        pin00.toggle();
        System.out.println("pin 01 has been toggled");


        //copied example GPIO calls:
        // create gpio controller instance
        //final GpioController gpio = GpioFactory.getInstance();

        // provision gpio pin #02 as an input pin with its internal pull down resistor enabled
        // (configure pin edge to both rising and falling to get notified for HIGH and LOW state
        // changes)
//		GpioPinDigitalInput myButton = gpio.provisionDigitalInputPin(RaspiPin.GPIO_02,             // PIN NUMBER
//				"MyButton",                   // PIN FRIENDLY NAME (optional)
//				PinPullResistance.PULL_DOWN); // PIN RESISTANCE (optional)


        // provision gpio pins #04 as an output pin and make sure is is set to LOW at startup
//		GpioPinDigitalOutput myLed = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_04,   // PIN NUMBER
//				"My LED",           // PIN FRIENDLY NAME (optional)
//				PinState.LOW);      // PIN STARTUP STATE (optional)

        // explicitly set a state on the pin object
//		myLed.setState(PinState.HIGH);

        // use convenience wrapper method to set state on the pin object
//		myLed.low();
//		myLed.high();

        // use toggle method to apply inverse state on the pin object
        //	myLed.toggle();

        // use pulse method to set the pin to the HIGH state for
        // an explicit length of time in milliseconds
        //myLed.pulse(1000);
    }
}
