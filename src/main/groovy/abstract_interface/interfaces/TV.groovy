package abstract_interface.interfaces

class TV implements RemoteControl{
    @Override
    void powerOn() {
        println("TV is now ON.")
    }

    @Override
    void powerOff() {
        println("TV is now OFF.")
    }
}
