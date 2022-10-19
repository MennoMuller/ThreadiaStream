package com.mennomuller;

import java.util.Random;

public class NumberGenerator extends Thread{

    private Random random = new Random();
    public final RecentNumbers recentNumbers = new RecentNumbers();

    @Override
    public void run() {
        while (true){
            recentNumbers.update(random.nextInt(10));
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
