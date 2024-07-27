package qftd.common.entity.device.phone;

import qftd.common.entity.device.phone.Phone;

public class HuaweiPhone implements Phone {

    @Override
    public void turnOn() {
        System.out.println("huawei phone turnOn");
    }

    @Override
    public void turnOff() {
        System.out.println("huawei phone turnOff");
    }

    @Override
    public void call() {
        System.out.println("huawei phone call");
    }

}
