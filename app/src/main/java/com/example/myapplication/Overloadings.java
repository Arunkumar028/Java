package com.example.myapplication;

public class Overloadings {

    public static class add {

        public int value(int a, int c) {
            return (a + c);
        }

        public int value(int a, int b,int c) {
            return (a + b);
        }

        public double value(double a, double b) {
            return (a + b);
        }
    }

    public static void main(String args[]) {
        add a = new add();
        System.out.println(a.value(10, 20));
        System.out.println(a.value(10, 20,40));
        System.out.println(a.value(10.5, 20.6));
    }
}