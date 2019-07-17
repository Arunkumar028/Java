package com.example.myapplication;

import java.util.HashMap;

public class Hashmapclass {

    public static void main() {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("arun", 12);
        map.put("kumar", 07);
        map.put("14", 14);
        System.out.println("size of maps" + map.size());
        System.out.println(map);
        map.remove("14");
    }

    public static class one {
        void main() {
            System.out.println("arunkumar");
        }

        public static void main(String args[]) {
            one opj = new one();
            opj.main();


        }
    }


    static class finals {
        void main() {
            System.out.println("tob bar");
        }

    }

    public static void main(String args[]) {
        new finals().main();
    }




}



