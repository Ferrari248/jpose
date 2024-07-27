package qftd.common.entity.device.phone;

import qftd.common.entity.device.phone.Phone;

public class XiaomiPhone implements Phone {
    @Override
    public void turnOn() {
        System.out.println("xiaomi phone turnOn");
    }

    @Override
    public void turnOff() {
        System.out.println("xiaomi phone turnOff");
    }

    @Override
    public void call() {
        System.out.println("xiaomi phone call");
    }
}
