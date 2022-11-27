import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //evala tuxaia tis times boolean
        /*Device Oven = new Device(true);
        Device Fridge = new Device(true);*/

        System.out.println();
        System.out.println("Type a device name to check if its on/off:");
        System.out.println("Oven");
        System.out.println("Fridge");
        System.out.println("Stove");
        /*System.out.println("Oven status: "+Oven.status);*/
        DeviceStatus();

    }

    static void DeviceStatus()
    {
        Scanner ReadDeviceName = new Scanner(System.in);
        String DeviceName = ReadDeviceName.nextLine();
        if (DeviceName.equals("Oven"))
        {

            Oven.Status();
        }
    }

}
