package com.neuedu.test.work1.Test5.work3;

public class HourlyEmployee extends ColaEmployee {
    private int hour;
    private int hoursale;


    @Override
    public void getSalary(String month) {
        if (hour > 160)
            System.out.println("第" + month + "个月：" + ((160 - hour) * 1.5 + 160 * hour));
        else {
            System.out.println("第" + month + "个月：" + (160 * hour));
        }

    }


    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getHoursale() {
        return hoursale;
    }

    public void setHoursale(int hoursale) {
        this.hoursale = hoursale;
    }
}
