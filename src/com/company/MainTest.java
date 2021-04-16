package com.company;

import static org.junit.Assert.*;

public class MainTest {

    @org.junit.Test
    public void mulitpliesOf3And5() {
        assertEquals(23,Main.mulitpliesOf3And5(10));
    }
    @org.junit.Test
    public void mulitpliesOf3And51000() {
        System.out.println(Main.mulitpliesOf3And5(1000));
    }

}