package app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DivisaoTest {

    @Test
    public void TesteBase() {

        Divisao d = new Divisao();
        double resultado = d.calculardivi(8, 2);
        assertEquals(4, resultado);
    }

    @Test
    public void TesteDecimal() {

        Divisao d = new Divisao();
        double resultado = d.calculardivi(5, 2.5);
        assertEquals(2, resultado);
    }

}
