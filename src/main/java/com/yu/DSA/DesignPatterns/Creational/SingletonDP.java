package com.yu.DSA.DesignPatterns.Creational;

public final class SingletonDP {//Need to declare as class as FINAL

    private static SingletonDP singletonObj;//declare PRIVATE STATIC

    private SingletonDP() {//declare PRIVATE CONSTRUCTOR

    }

    public static SingletonDP getInstance() {
        if (singletonObj == null) {
            synchronized (SingletonDP.class) {
                singletonObj = new SingletonDP();
            }
        }
        return singletonObj;
    }
    public static void main(String[] args) {
        System.out.println("this is for testing");
    }
}
