package com.neuedu.test.work2.Test6.work1;

public class Wind implements Instrument {
    @Override
    public void play() {
        System.out.println("弹奏wind");
    }
    public void playWind()
    {
        System.out.println("调出wind的play2方法");
    }
}
