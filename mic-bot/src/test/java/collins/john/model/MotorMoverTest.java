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
public class MotorMoverTest
{
    //TODO: Try a deployed test to run on native architecture, ARM 32bit.
    //TODO: Try completely original mock object and specify all responses.

    //this library will only run on ARM 32bit.
    @Mock
    GpioController gpioController;

    @InjectMocks
    private MotorMover motorMover;

    //this test will only run on ARM 32bit.
    @Test
    public void toggleLED_test()
    {
        motorMover.toggleLED();
        verify(gpioController).toggle();
        verifyNoMoreInteractions(gpioController);
    }
}