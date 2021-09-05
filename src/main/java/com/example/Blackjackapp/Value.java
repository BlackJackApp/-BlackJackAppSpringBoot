package com.example.Blackjackapp;

public enum Value {

    // Defines Values
    ACE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(10),
    QUEEN(10),
    KING(10);

    public int value;

    Value(int cValue){
        value = cValue;
    }

    // Getters and Setters
    public int getValue(){
        return value;
    }

    public void setValue(int value){
        this.value = value;
    }
}
