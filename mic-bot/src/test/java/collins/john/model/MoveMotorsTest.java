/**
 * John Antonio Collins 4/27/17
 **/

package collins.john.model;

import com.pi4j.io.gpio.GpioController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

@RunWith(MockitoJUnitRunner.class)
public class MoveMotorsTest
{

    //TODO: Q: what to mock exactly for R'Pi? GpioController or individual pins or something in between?
    //TODO: fix 64 bit library error?
    //TODO: Look up Jenkins and do a deployed test to run on native architecture, ARM 32bit.

    @Mock
    GpioController gpioController;

    @InjectMocks
    private MoveMotors moveMotors;

    public MoveMotorsTest() throws Exception
    {
    }

    @Test
    public void toggleLED_test()
    {
        moveMotors.toggleLED();
        verify(gpioController).toggle();
        verifyNoMoreInteractions(gpioController);
    }
}