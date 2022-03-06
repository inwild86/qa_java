package com.example;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)

public class CatTest {

    private Cat cat;

    @Mock
    Feline feline;

    @Before
    public void setUp() throws Exception {
       cat = new Cat(feline);
    }

    @Test
    public void getSoundReturnsCorrectValue() {
        String expected = "Мяу";
        String actual =cat.getSound() ;
        assertEquals(expected, actual);

    }

    @Test
    public void getFoodReturnsCorrectValue() throws Exception{
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = cat.getFood();
        assertEquals(expected, actual);
    }
}