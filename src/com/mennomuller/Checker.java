package com.mennomuller;

import java.util.Scanner;

public class Checker extends Thread{
    private final NumberGenerator numberGenerator;
    private final Scanner input = new Scanner(System.in);

    public Checker(NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
    }

    @Override
    public void run() {
        while (true){
            input.nextLine();
            if(numberGenerator.recentNumbers.checkPair()){
                System.out.println("They are the same!");
            } else {
                System.out.println("They are not the same!");
            }
        }
    }
}
