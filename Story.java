package com.example.cvest31;

public class Story {
    protected Sityation currentSityation;
    public Story(Sityation currentSityation) {
        this.currentSityation = currentSityation;
    }

    public void go(int an){
        currentSityation=currentSityation.d[an-1];

    }
    public boolean isEnd(){
        return currentSityation.d.length==0;
    }

    public void currentSityation() {
    }
}
