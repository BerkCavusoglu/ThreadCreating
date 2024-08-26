package com.mycompany.threadcreating2;


public class Printer implements Runnable {

    private String isim;
    
    public Printer(String isim) {
        this.isim = isim;
    }
    @Override
    public void run() {
        System.out.println(isim + " Running...");
        
        for (int i = 1; i<=10; i++) {
            try {
             System.out.println(isim + " Writing : "+ i);
             
             Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Thread interrupted");
            }
        }
    }
    
    }
    

