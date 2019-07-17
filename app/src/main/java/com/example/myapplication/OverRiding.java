package com.example.myapplication;

public class OverRiding {

    public static class one {
        void opj() {
            System.out.println("arun03");
        }
    }
    public static class three extends one {
        void opj() {
            System.out.println("arunkumar00"); }

        public static void main(String args[]){
            three ops= new three();
            ops.opj();
            one ops1= new one();
            ops1.opj();
        }
    }
}
