package com.company;

public class MiThread extends Thread {
    long tiempo = 0;
    String nombre = "";

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++){
            MiThread mT = new MiThread();

            mT.nombre = "hilo "+ String.valueOf(i);
            mT.tiempo = (long) (Math.random()*(8000 - 1000) + 1000);

            try {
                mT.sleep(mT.tiempo);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("El "+mT.nombre+" ha dormido por "+mT.tiempo+" milisegundos");

        }
    }


}



