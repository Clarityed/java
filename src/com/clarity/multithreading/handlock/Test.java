package com.clarity.multithreading.handlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 手动锁 Lock
 *
 * @author: clarity
 * @date: 2022年09月14日 11:53
 */
public class Test {

    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        lock.lock();

        try {
            System.out.println("获得锁");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("释放锁");
            lock.unlock();
        }
    }

}
