package abstract_interface.interfaces.belajar;

public class TV implements RemoteControl{

    @Override
    public void powerOn() {
        System.out.println("TV is now ON.");
    }

    @Override
    public void powerOff() {
        System.out.println("TV is now OFF.");
    }
}
