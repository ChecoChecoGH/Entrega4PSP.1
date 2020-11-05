package com.company;

public class Main {

    public static void main(String[] args) {

        for(int i = 1; i <= 5; i++){

            System.out.println("ITERACION "+i+":");
            MiThread t = new MiThread();
            t.start();
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            try {
                t.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }
}
