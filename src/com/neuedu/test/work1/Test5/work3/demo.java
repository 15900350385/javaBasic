package com.neuedu.test.work1.Test5.work3;

import java.util.Random;

public class demo {
    public static void main(String[] args) {
        Random random =new Random();
        SalariedEmployee salariedEmployee = new SalariedEmployee() ;
        HourlyEmployee hourlyEmployee = new HourlyEmployee();
        hourlyEmployee.setHour(176);
        hourlyEmployee.setHoursale(22);
        SalesEmployee salesEmployee = new SalesEmployee();
        salesEmployee.setSale(50000);
        salesEmployee.setTcl(0.60);
        demo.payWage(hourlyEmployee);
        demo.payWage(salariedEmployee);
        demo.payWage(salesEmployee);
        System.out.println("    ");
        ColaEmployee[] arr ={hourlyEmployee,salariedEmployee,salesEmployee};
        for (int i = 0 ;i<arr.length;i++)
            hourlyEmployee.setHour(random.nextInt(200));
            salesEmployee.getSalary(random.toString());
            salariedEmployee.getSalary("2");
            hourlyEmployee.getSalary("2");
            salesEmployee.getSalary("2");

        for(ColaEmployee ss:arr)
        {
            System.out.println(ss);
        }





    }
    public  static  void payWage(ColaEmployee emp) {
        emp.getSalary("6");
    }
}