package com.mennomuller;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class RecentNumbers {
    private byte num1;
    private byte num2;

    ReadWriteLock lock = new ReentrantReadWriteLock();

    public void update(int newNumber) {
        lock.writeLock().lock();
        try {
            num1 = num2;
            num2 = (byte) newNumber;
            System.out.println(newNumber);
        } finally {
            lock.writeLock().unlock();
        }
    }

    public boolean checkPair() {
        lock.readLock().lock();
        try {
            return num1 == num2;
        } finally {
            lock.readLock().unlock();
        }
    }

}
