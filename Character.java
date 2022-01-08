package com.example.cvest31;

public class Character {
    protected int K,A,R;
    protected String name;
    public Character(String name, int k, int a, int r ) {
        K = k;
        A = a;
        R = r;
        this.name = name;
    }
    public void showStatus(){
        System.out.println("K="+K+", A="+ A+", R="+R);
    }
}