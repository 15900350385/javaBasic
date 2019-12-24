package com.neuedu.test.work1.Test5.work3;

public class SalesEmployee extends ColaEmployee {
    private int sale;
    private double tcl;

    @Override
    public void getSalary(String month) {
        System.out.println("第"+month+"个月："+(sale*tcl));
    }

    public int getSale() {
        return sale;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    public double getTcl() {
        return tcl;
    }

    public void setTcl(double tcl) {
        this.tcl = tcl;
    }
}
