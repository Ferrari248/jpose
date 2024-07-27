package qftd.common.entity.device;

public abstract class AbstractPhone implements Device {

    public void turnOn() {
        System.out.println("AbstractPhone turnOn");
    }

    public void turnOff() {
        System.out.println("AbstractPhone turnOff");
    }
}
