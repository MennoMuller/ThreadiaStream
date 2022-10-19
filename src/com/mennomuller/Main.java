package com.mennomuller;

public class Main {

    public static void main(String[] args) {
        NumberGenerator ng = new NumberGenerator();
        Checker checker = new Checker(ng);
        ng.start();
        checker.start();
    }
}
