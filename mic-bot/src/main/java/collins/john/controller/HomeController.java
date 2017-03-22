package collins.john.controller;

import collins.john.model.MoveMotors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by johncollins on 3/7/17.
 */
@RestController
public class HomeController
{
    private MoveMotors moveMotors;

    @Autowired
    public HomeController(MoveMotors moveMotors)
    {
        this.moveMotors = moveMotors;
    }

    @RequestMapping("/rsvp")
    public String rsvp(@RequestParam(value = "thing", defaultValue = "nada") String thing)
    {
        return moveMotors.returnString(thing);
    }

    @RequestMapping("/toggle")
    public void togglePin()
    {
        moveMotors.gpioPinTest();
        System.out.println("pin 01 has been toggled.");
    }

//    @RequestMapping("/greeting")
//    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
//        return new Greeting(counter.incrementAndGet(),
//                String.format(template, name));
//    }
}


