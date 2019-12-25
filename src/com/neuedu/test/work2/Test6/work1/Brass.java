package com.neuedu.test.work2.Test6.work1;

public class Brass implements Instrument {

    @Override
    public void play() {
        System.out.println("弹奏brass");
    }
    public void playBrass()
    {
        System.out.println("调用Brass的play2方法");
    }
}
