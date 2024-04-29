package ch.zhaw.springboot.demo_projekt_springboot;

import static
org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
public class MathlibTest {

    @Test
    public void testEven1() {
        assertTrue(MathLib.isEven(2));

    }
}