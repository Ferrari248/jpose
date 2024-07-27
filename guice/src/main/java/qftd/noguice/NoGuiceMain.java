package qftd.noguice;

import qftd.common.entity.device.phone.HuaweiPhone;
import qftd.common.entity.device.phone.XiaomiPhone;
import qftd.common.entity.person.Student;

public class NoGuiceMain {
    public static void main(String[] args) {
        Student zhangsan = new Student(1L, "zhangsan");
        zhangsan.setPhone(new XiaomiPhone());

        Student lisi = new Student(2L, "lisi");
        lisi.setPhone(new HuaweiPhone());

        zhangsan.getPhone().turnOn();
        lisi.getPhone().turnOn();
    }
}
