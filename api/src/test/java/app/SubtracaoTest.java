package app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SubtracaoTest {

    @Test
    public void TesteBase () {
        Subtracao sub = new Subtracao();
        double resultado = sub.calcularsub(10, 10);
        assertEquals(0, resultado);
    }

    @Test
    public void TesteDecimal() {
        Subtracao sub = new Subtracao();
        double resultado = sub.calcularsub(5, 2.5);
        assertEquals(2.5, resultado);
    }
}