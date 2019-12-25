package com.neuedu.test.work2.Test6.work3;

public class Cylinder implements C {

    private int radius;
    private int height;
    private String color;



    @Override
    public void volume() {

    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public void setColor(String c) {

    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }
}
