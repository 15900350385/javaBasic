package com.neuedu.test.Test7.work4;

public class jdk {
    public static void main(String[] args) {
        String str =new String("jdk");
        System.out.println(str.toUpperCase() );
        String str1 = new String(str.toUpperCase());
        System.out.println(str1.charAt(1)+ ""+(str1.charAt(2)));
    }
}
