package qftd.noguice;

import qftd.common.entity.device.HuaweiPhone;
import qftd.common.entity.device.Iphone;
import qftd.common.entity.person.Student;

public class NoGuiceMain {
    public static void main(String[] args) {
        Student zhangsan = new Student(1L, "zhangsan");
        zhangsan.setDevice(new Iphone());

        Student lisi = new Student(2L, "lisi");
        lisi.setDevice(new HuaweiPhone());

        zhangsan.getDevice().turnOn();
        lisi.getDevice().turnOn();
    }
}
