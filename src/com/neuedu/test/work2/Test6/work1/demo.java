package com.neuedu.test.work2.Test6.work1;

public class demo {
    public static void main(String[] args) {
        Wind wind =new Wind();
        wind.play();
        wind.playWind();
        Instrument instrument = new Brass();
        instrument.play();
        ((Brass) instrument).playBrass();
    }
}
