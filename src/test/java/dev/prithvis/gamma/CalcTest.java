package dev.prithvis.gamma;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class CalcTest {
    private Calc calc;
    @Before
    public void setUp() {
        calc=new Calc();
    }
    @After
    public void tearDown()  {
        calc=null;
    }
    @Test
    public void testDefaultIncrementToNumber(){
        assertEquals(11,calc.returnWithIncrement(10));
    }
    @Test
    public void testDefaultIncrementValue(){
        assertEquals(1,calc.getIncrement());
    }
    @Test
    public void testSetIncrementedValue(){
        calc.setIncrement(5);
        assertEquals(5,calc.getIncrement());
    }
    @Test
    public void testUpdatedIncrementToNumber(){
        calc.setIncrement(3);
        assertEquals(13,calc.returnWithIncrement(10));
    }
    @Test
    public void testWithConstructor(){
        calc=new Calc(12);
        assertEquals(13,calc.returnWithIncrement(1));
    }
}