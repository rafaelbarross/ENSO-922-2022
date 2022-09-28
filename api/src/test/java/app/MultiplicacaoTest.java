package app;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MultiplicacaoTest {

    @Test
    public void TesteBase () {
        Multiplicacao multi = new Multiplicacao();
        double resultado = multi.calcularMultiplicacao(10, 10);
        assertEquals(100, resultado);
    }

    @Test
    public void TesteDecimal() {
        Multiplicacao multi = new Multiplicacao();
        double resultado = multi.calcularMultiplicacao(5, 2.5);
        assertEquals(12.5, resultado);
    }
 
    @Test
    public void TesteNumeroGrande() {
        Multiplicacao multi = new Multiplicacao();
        double resultado =  multi.calcularMultiplicacao(1.000000, 1.000000);
        assertEquals(1.000000000000, resultado);
    }

    @Test
    public void TesteDecimalxDecimal() {
        Multiplicacao multi = new Multiplicacao();
        double resultado =  multi.calcularMultiplicacao(12.90, 12.90);
        assertEquals(166.41, resultado);
    }
}
