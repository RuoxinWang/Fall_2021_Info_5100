package com.company;

public class Printer {
    private static Printer _instance;

    private Printer() {
    }

    private static Object obj = new Object();

    public String name = "Default";

    public static Printer getInstance() {

        if (_instance == null) {
            synchronized (obj) {
                if (_instance == null) {
                    _instance = new Printer();
                }
            }
        }
        return _instance;
    }

    public static Printer getConnection() {
        if (_instance == null) {
            synchronized (obj) {
                if (_instance == null) {
                    _instance = new Printer();
                }
            }
        }
        return _instance;
    }
}
