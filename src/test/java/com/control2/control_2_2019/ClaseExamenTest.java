package com.control2.control_2_2019;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;


public class ClaseExamenTest {

    @Test
    public void testPrimos6() {
        assertEquals(Arrays.asList(2, 3), ClaseExamen.primos(6)); // 6 = 2 * 3
    }

    @Test
    public void testPrimos13() {
        assertEquals(Arrays.asList(13), ClaseExamen.primos(13)); // 13 es primo
    }

    @Test
    public void testPrimos25() {
        assertEquals(Arrays.asList(5, 5), ClaseExamen.primos(25)); // 25 = 5 * 5
    }

    @Test
    public void testPrimosInvalidInput() {
        try {
            ClaseExamen.primos(1);
        } catch (EntradaInvalida e) {
            assertEquals("El número debe ser mayor que 1.", e.getMessage());
        }
    }
}
