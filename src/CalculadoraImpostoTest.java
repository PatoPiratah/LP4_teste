import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.testng.annotations.Test;

public class CalculadoraImpostoTest {
    @Test
    public void testParaSP() {
        CalculadoraImposto calculadora = new CalculadoraImposto("SP", 100.0f);
        float imposto = calculadora.calcularImposto();
        assertEquals(18.0f, imposto, 0.01f);
    }

    @Test
    public void testParaRJ() {
        CalculadoraImposto calculadora = new CalculadoraImposto("RJ", 150.0f);
        float imposto = calculadora.calcularImposto();
        assertEquals(27.0f, imposto, 0.01f);
    }
}