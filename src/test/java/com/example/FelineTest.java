package com.example;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;
import java.util.Arrays;


public class FelineTest {

    private Feline feline;

    @Before
    public void initObjects() {
        feline = new Feline(); // создали экземпляр класса
    }

    @Test
    public void eatMeatTest() throws Exception{
        List<String> actualFood = feline.eatMeat();
        assertEquals( Arrays.asList("Животные","Птицы","Рыба"),actualFood);

    }

    @Test
    public void getFamilyReturnsCorrectValue() {
       String actualKind = feline.getFamily();
        assertEquals("Кошачьи", actualKind);
    }

    @Test
    public void getKittensReturnsCorrectValue() {
        int actualKittens = feline.getKittens(3);
        assertEquals(3, actualKittens);
    }

    @Test
    public void GetKittensTest() {
        int actualKittens = feline.getKittens();
        assertEquals(1, actualKittens);
    }

}