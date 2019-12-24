package com.neuedu.test.work1.Test5.work1;

public class demo {
    public static void main(String[] args) {
        Bord bord = new MaQue();
        bord.setChibang(true);
        bord.setLeg(2);
        ((MaQue) bord).setAge(15);
        ((MaQue) bord).setWeight("1.25克");
        System.out.println("翅膀："+bord.isChibang()+"腿："+bord.isLeg()+"重量："+((MaQue) bord).getWeight()+"年龄："+((MaQue) bord).getAge());
        Bord bord1=new TuoNiao();
        Bord bord2 =new Ying();


    }
}
