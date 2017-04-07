package collins.john.model;

import org.springframework.stereotype.Component;

/**
 * Created by johncollins on 3/27/17.
 */
@Component
public class MicbotCamera
{
//    BufferedImage myImage;
//    byte[] myImageAsByte;
//
//    public byte[] serveMyImage()
//    {
//        try
//        {
//            // Invoke raspistill to take the photo.
//            Process process = Runtime.getRuntime().exec("raspistill -n -vf -o /home/pi/TEST-01.jpg");
//            myImage = ImageIO.read(new File("/home/pi/TEST-01.jpg"));
//            ByteArrayOutputStream baos = new ByteArrayOutputStream();
//            ImageIO.write(myImage, "jpg", baos);
//            byte[] myImageAsByte = baos.toByteArray();
//            return myImageAsByte;
//
//        } catch (java.io.IOException e)
//        {
//            System.out.println("caught java.io.IOException");
//        }
//        return myImageAsByte;
//    }

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
