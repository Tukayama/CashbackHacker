package ru.netology.service;


import org.junit.Test;
import static org.junit.Assert.*;
public class CashbackHackServiceTest   {
    @Test
    public void missingAmount(){
        CashbackHackService cashbackHackService=new CashbackHackService();
        int amount=900;
        int expected = 100;
        int astual =cashbackHackService.remain(amount);
        assertEquals(expected,astual);

    }

}