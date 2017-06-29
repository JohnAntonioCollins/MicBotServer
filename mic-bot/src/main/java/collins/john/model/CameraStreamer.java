package collins.john.model;

import org.springframework.stereotype.Component;

/**
 * Created by johncollins on 3/27/17.
 */
@Component
public class CameraStreamer
{
    public void streamVideo()
    {
        try
        {
            Process process = Runtime.getRuntime().exec("python /home/pi/dev/Flask/flask-video-streaming/app.py");
        } catch (
                java.io.IOException e)
        {
            System.out.println("caught java.io.IOException");
        }
    }

    public void stopStreaming()
    {
        try
        {
            Process process = Runtime.getRuntime().exec("sudo pkill -9 python");
        } catch (
                java.io.IOException e)
        {
            System.out.println("caught java.io.IOException");
        }
    }
}
