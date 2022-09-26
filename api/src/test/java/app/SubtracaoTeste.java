
package app;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class SubtracaoTeste {

    @Test
    public void testeCasoBase(){

        sub sub = new sub();
        double resultado = sub.calcularsub(2,2);
        assertEquals(0, resultado);
    }
    @Test
    public void testeCasoDecimal(){

        sub sub = new sub();
        double resultado = sub.calcularsub(2,2.5);
        assertEquals(0.5, resultado);
    }
}


