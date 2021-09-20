package com.example.Blackjackapp;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    @Test
    @DisplayName("Initialisation")
    void dealerInit(){
        Person person = new Person();
        person.setName("someName");
        String actualName = person.getName();
        String expectedName = "someName";
        assertSame(expectedName,actualName,"Can set a name");
    }
}
