package com.hashanthi.lamda.example1;

public class ByLamda {

    public static void main(String[] args) {

//        Math math = new Math() {
//            @Override
//            public int power(int x) {
//                return x*x;
//            }
//        };

        Math math = x->  x*x;

        int anzer =  math.power(9);

        System.out.println(anzer);

    }
}
