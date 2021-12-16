package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    @Test
    public void calculateBonusWhenMore1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2600;
        int actual = service.remain(2600);
        int expected = 400;
        assertEquals(actual, expected);
    }

    @Test
    public void calculateBonusWhenEquals1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void calculateBonusWhenLess1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 990;
        int actual = service.remain(990);
        int expected = 10;
        assertEquals(actual, expected);
    }
}