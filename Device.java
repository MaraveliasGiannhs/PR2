public class Device
{
    static boolean status;
     Device(boolean status)
    {
        this.status=status;
    }


     public void PowerOn ()
    {
        this.status=true;
        System.out.println("The device is on. Status:"+this.status);
    }
     public void PowerOff (boolean status)
    {
        this.status=false;
        System.out.println("The device is off. Status:"+this.status);
    }
      public boolean Status (boolean status)
    {
        return this.status;
    }

}