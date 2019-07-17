package com.example.myapplication;

public class arraylist {

    public static void main(String args[]) {
        int a[] = {10, 20, 30, 44, 55, 10, 20};
        for (int i = 1; i < a.length; i++) {
            System.out.println(a[i]);
        }}}

class array {
    public static void main(String args[]) {
//2d array
        int a[][] = {{50,89,99},{80, 90, 100}, {20, 50, 60}};
        for (int i = 0; i <a.length; i++) {
            for (int j = 0; j <1; j++) {
                System.out.println(a[i][j]);
                String abc="";

                if (abc.equals(a[i].length==0)){
                    System.out.println("arun"+abc);
                }
            }
            System.out.println();
        }
    }

}


class abc{
    public static void main (String args[]){
        String arun="arun-kumar";

        for (int i=0;i<arun.length();i++){
          char c=arun.charAt(i);
          String opj=Character.toString(c);
          if (i==0){
              System.out.println("12"+opj);
          }
            System.out.println(opj);
        }





//        String[] opj=arun.split("-");
//        String part=opj[0];
////        String part1=opj[1];
////        String part2=opj[2];
////        String part4=opj[3];
        //System.out.println(part);



    }





}

class Vehicle
{
    void bike() {
        System.out.println("Bike is running2");
    }

}
class Honda extends Vehicle
{
    void bike() {
        System.out.println("Bike is running2");
    }
}

 class AbstractExample1 {

    public static void main(String[] args) {

        Honda obj=new Honda();
        obj.bike();

    }
}


