package com.neuedu.test.work1.Test5.work3;

public class SalariedEmployee extends ColaEmployee {
    private int HourlyEmployee =20000;
    @Override
    public void getSalary(String month) {
        System.out.println("第"+month+"个月："+HourlyEmployee);
    }
}
