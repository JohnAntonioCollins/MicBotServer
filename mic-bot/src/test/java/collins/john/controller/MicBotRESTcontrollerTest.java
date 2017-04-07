package collins.john.controller;

import collins.john.model.MoveMotors;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

/**
 * Created by johncollins on 3/7/17.
 */
@RunWith(MockitoJUnitRunner.class)
public class MicBotRESTcontrollerTest
{
    @Mock
    private MoveMotors moveMotors;

    @InjectMocks
    private MicBotRESTcontroller controller;


    public MicBotRESTcontrollerTest() throws Exception
    {
    }

    @Test
    public void shouldCallMoveMotors_toggleLED()
    {
        controller.toggleLED();

        verify(moveMotors).toggleLED();
        verifyNoMoreInteractions(moveMotors);
    }

    @Test
    public void shouldCallMoveMotors_motor_A_forward()
    {
        controller.motor_A_forward();

        verify(moveMotors).motor_A_forward();
        verifyNoMoreInteractions(moveMotors);
    }

    @Test
    public void shouldCallMoveMotors_motor_A_reverse()
    {
        controller.motor_A_reverse();

        verify(moveMotors).motor_A_reverse();
        verifyNoMoreInteractions(moveMotors);
    }

    @Test
    public void shouldCallMoveMotors_motor_B_forward()
    {
        controller.motor_B_forward();

        verify(moveMotors).motor_B_forward();
        verifyNoMoreInteractions(moveMotors);
    }

    @Test
    public void shouldCallMoveMotors_motor_B_reverse()
    {
        controller.motor_B_reverse();

        verify(moveMotors).motor_B_reverse();
        verifyNoMoreInteractions(moveMotors);
    }

}
