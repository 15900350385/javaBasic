package com.neuedu.test.work2.Test6.work2;

public class Test {
    public static void main(String[] args) {
        Compute compute =new Add();
        Compute compute1 = new sub();
        Compute compute2 = new Cheng();
        Compute compute3 =new Chu();
        UseCompute useCompute = new UseCompute();
        useCompute.useCom(compute,55,33);
        useCompute.useCom(compute1,22,12);
        useCompute.useCom(compute2,2,3);
        useCompute.useCom(compute3,15,3);
    }
}
