import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculadoraImpostoTest {

    @Test
    public void testAcre() {
        CalculadoraImposto calculadora = new CalculadoraImposto("AC", 1000.00);
        double imposto = calculadora.calcularImposto();
        assertEquals(170.00, imposto, 0.01);
    }

    @Test
    public void testAlagoas() {
        CalculadoraImposto calculadora = new CalculadoraImposto("AL", 1000.00);
        double imposto = calculadora.calcularImposto();
        assertEquals(170.00, imposto, 0.01);
    }
}