package com.itstudy.crm;

import jp.itstudy.crm.Staff;

public class StaffTest {
    public static void main(String[] args) {


        Staff staff = new Staff();
        staff.setName("a");
        staff.setAge(20);
        Staff staff1 = new Staff(111,"b",21,"male");
        staff.work();
        staff1.work();
    }
}
