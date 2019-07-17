package com.example.myapplication;

public class Revers {
    public static void main(String args[]) {
        String name = "arunkumar";
        char[] opj = name.toCharArray();
        for (int i = opj.length -1; i >= 0; i--) {
            System.out.println(opj[i]);
        }
    }
}
