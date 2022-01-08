package com.example.cvest31;

public class Sityation {
    protected String text;
    protected String subject;
    protected Sityation[] d;
    protected int dK, dA, dR;

    public Sityation(String subject,String text, int directionCount, int dK, int dA, int dR) {
        this.text = text;
        this.subject = subject;
        this.d = new Sityation[directionCount];
        this.dK = dK;
        this.dA = dA;
        this.dR = dR;
    }


    public void show(){
        System.out.println(subject);
        System.out.println(text);
    }
}
