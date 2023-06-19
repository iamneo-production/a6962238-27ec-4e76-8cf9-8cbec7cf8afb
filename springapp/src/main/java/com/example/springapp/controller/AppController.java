package com.example.springapp;

public class AppController {
    private int a;
    private int b;
    
    
    public AppController() {
    }

    public AppController(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "AppController [a=" + a + ", b=" + b + "]";
    }
    
}
