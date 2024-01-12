package Skvoznaya2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class calcTest {

    @Test
    public void testPlus() {
        assertEquals(Ideone.calc(ExpressionParser.parse("2+2")),"4.0");
    }

    @Test
    public void testMul() {
        assertEquals(Ideone.calc(ExpressionParser.parse("2*2")),"4.0");
    }

    @Test
    public void testDev() {
        assertEquals(Ideone.calc(ExpressionParser.parse("2/2")),"1.0");
    }

    @Test
    public void testPlusMul() {
        assertEquals(Ideone.calc(ExpressionParser.parse("2+2*2")),"6.0");
    }

    @Test
    public void testBrackets() {
        assertEquals(Ideone.calc(ExpressionParser.parse("(2+2)*2,"8.0");
    }

}
