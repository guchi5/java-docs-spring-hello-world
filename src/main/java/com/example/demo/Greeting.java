package com.example.demo;

public class Greeting {
    private long counter;
    private String templete;

    public Greeting(long counter, String templete){
        this.counter = counter;
        this.templete = templete;
    }

    public long getCounter(){
        return this.counter;
    }

    public String getTemlete(){
        return this.templete;
    }

    public void setCounter(long counter){
        this.counter = counter;
    }

    public void setTemplete(String templete){
        this.templete = templete;
    }
}

