package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TestParametrizado2 {

    @ParameterizedTest
    @CsvSource({
            "I, 1",
            "IV, 4",
            "IX, 9",
            "XLIX, 49",
            "L, 50",
            "CCCXCIX, 399",
            "D, 500",
            "CMXLIV, 944",
            "CMXCIX, 999",
            "M, 1000"
    })
    public void testRomanoParaDecimal(String roman, int expectedDecimal) {
        Conversor2 conversor = new Conversor2();
        assertEquals(expectedDecimal, conversor.romanoParaDecimal(roman));
    }

}

