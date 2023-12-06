package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class Conversor2Test {

    private static Conversor2 conversor;

    @BeforeAll
    public static void setUp() {
        conversor = new Conversor2(); // Inicialização do conversor antes de todos os testes
    }

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
    public void testRomanoParaDecimalParametrizado(String romano, int esperadoDecimal) {
        assertEquals(esperadoDecimal, conversor.romanoParaDecimal(romano));
    }

    @Test
    public void testDecimalParaRomano() {
        assertEquals("I", conversor.DecimalParaRomano(1));
        assertEquals("IV", conversor.DecimalParaRomano(4));
        assertEquals("V", conversor.DecimalParaRomano(5));
    }

    @Test
    public void testRomanoParaDecimal() {
        assertEquals(1, conversor.romanoParaDecimal("I"));
        assertEquals(4, conversor.romanoParaDecimal("IV"));
        assertEquals(5, conversor.romanoParaDecimal("V"));
    }

    @Test
    public void testMenorQueZero() {
        String mensagem ="Não é possível converter o número decimal informado para algarismos romanos.";
        assertEquals(mensagem,conversor.DecimalParaRomano(-1));
    }
    @Test
    public void testMaiorQueQuatroMil() {
        String mensagem ="Não é possível converter o número decimal informado para algarismos romanos.";
        assertEquals(mensagem,conversor.DecimalParaRomano(4001));
    }

    @Test
    public void testRepetirMaisDeTresAlgarismos() {
        String esperado="IIII";
        assertNotEquals(esperado,conversor.DecimalParaRomano(4));
    }

    @Test
    public void testSomaDosAlgarismos() {
        String esperado="VII";
        assertNotEquals(esperado,conversor.DecimalParaRomano(511));
    }

}

