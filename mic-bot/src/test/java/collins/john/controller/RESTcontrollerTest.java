package collins.john.controller;

import collins.john.model.MotorMover;
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
public class RESTcontrollerTest
{
    @Mock
    private MotorMover motorMover;

    @InjectMocks
    private RESTcontroller controller;

    @Test
    public void shouldCallMoveMotors_toggleLED()
    {
        controller.toggleLED();

        verify(motorMover).toggleLED();
        verifyNoMoreInteractions(motorMover);
    }

    @Test
    public void shouldCallMoveMotors_motor_A_forward()
    {
        controller.motor_A_forward();

        verify(motorMover).motor_A_forward();
        verifyNoMoreInteractions(motorMover);
    }

    @Test
    public void shouldCallMoveMotors_motor_A_reverse()
    {
        controller.motor_A_reverse();

        verify(motorMover).motor_A_reverse();
        verifyNoMoreInteractions(motorMover);
    }

    @Test
    public void shouldCallMoveMotors_motor_B_forward()
    {
        controller.motor_B_forward();

        verify(motorMover).motor_B_forward();
        verifyNoMoreInteractions(motorMover);
    }

    @Test
    public void shouldCallMoveMotors_motor_B_reverse()
    {
        controller.motor_B_reverse();

        verify(motorMover).motor_B_reverse();
        verifyNoMoreInteractions(motorMover);
    }

}
