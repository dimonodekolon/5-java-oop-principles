package com.example.task01;

public class Task01Main {
    public static void main(String[] args) {

        Logger logger1 = Logger.getLogger("test");
        Logger logger2 = Logger.getLogger("test");
        Logger logger3 = new Logger("test");

        System.out.println(logger3 == logger1);
        System.out.println(logger2 == logger1);
    }
}
