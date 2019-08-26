package com.hashanthi.lamda.example1;

public class Application2 {

    public static void main(String[] args) {

        Math math = new Math() {
            @Override
            public int power(int x) {
                return x*x;
            }
        };

       int anzer =  math.power(4);

        System.out.println(anzer);
    }

}
