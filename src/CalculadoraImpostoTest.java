import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraImpostoTest {
    private CalculadoraImposto calculadora;

    @BeforeEach
    public void setUp() {
        calculadora = new CalculadoraImposto("TT", 100.0f);
    }

    @Test
    public void testParaAC() {
        calculadora.setEstado("AC");
        calculadora.setValorProduto(100.0f);
        float imposto = calculadora.calcularImposto();
        assertEquals(17.0f, imposto, 0.01f);
    }

    @Test
    public void testParaAL() {
        calculadora.setEstado("AL");
        calculadora.setValorProduto(100.0f);
        float imposto = calculadora.calcularImposto();
        assertEquals(17.0f, imposto, 0.01f);
    }

    @Test
    public void testParaAM() {
        calculadora.setEstado("AM");
        calculadora.setValorProduto(100.0f);
        float imposto = calculadora.calcularImposto();
        assertEquals(18.0f, imposto, 0.01f);
    }

    @Test
    public void testParaAP() {
        calculadora.setEstado("AP");
        calculadora.setValorProduto(100.0f);
        float imposto = calculadora.calcularImposto();
        assertEquals(18.0f, imposto, 0.01f);
    }

    @Test
    public void testParaBA() {
        calculadora.setEstado("BA");
        calculadora.setValorProduto(100.0f);
        float imposto = calculadora.calcularImposto();
        assertEquals(18.0f, imposto, 0.01f);
    }

    @Test
    public void testParaCE() {
        calculadora.setEstado("CE");
        calculadora.setValorProduto(100.0f);
        float imposto = calculadora.calcularImposto();
        assertEquals(18.0f, imposto, 0.01f);
    }

    @Test
    public void testParaDF() {
        calculadora.setEstado("DF");
        calculadora.setValorProduto(100.0f);
        float imposto = calculadora.calcularImposto();
        assertEquals(18.0f, imposto, 0.01f);
    }

    @Test
    public void testParaES() {
        calculadora.setEstado("ES");
        calculadora.setValorProduto(100.0f);
        float imposto = calculadora.calcularImposto();
        assertEquals(17.0f, imposto, 0.01f);
    }

    @Test
    public void testParaGO() {
        calculadora.setEstado("GO");
        calculadora.setValorProduto(100.0f);
        float imposto = calculadora.calcularImposto();
        assertEquals(17.0f, imposto, 0.01f);
    }

    @Test
    public void testParaMA() {
        calculadora.setEstado("MA");
        calculadora.setValorProduto(100.0f);
        float imposto = calculadora.calcularImposto();
        assertEquals(18.0f, imposto, 0.01f);
    }

    @Test
    public void testParaMT() {
        calculadora.setEstado("MT");
        calculadora.setValorProduto(100.0f);
        float imposto = calculadora.calcularImposto();
        assertEquals(17.0f, imposto, 0.01f);
    }

    @Test
    public void testParaMS() {
        calculadora.setEstado("MS");
        calculadora.setValorProduto(100.0f);
        float imposto = calculadora.calcularImposto();
        assertEquals(17.0f, imposto, 0.01f);
    }

    @Test
    public void testParaMG() {
        calculadora.setEstado("MG");
        calculadora.setValorProduto(100.0f);
        float imposto = calculadora.calcularImposto();
        assertEquals(18.0f, imposto, 0.01f);
    }

    @Test
    public void testParaPA() {
        calculadora.setEstado("PA");
        calculadora.setValorProduto(100.0f);
        float imposto = calculadora.calcularImposto();
        assertEquals(17.0f, imposto, 0.01f);
    }

    @Test
    public void testParaPB() {
        calculadora.setEstado("PB");
        calculadora.setValorProduto(100.0f);
        float imposto = calculadora.calcularImposto();
        assertEquals(18.0f, imposto, 0.01f);
    }

    @Test
    public void testParaPR() {
        calculadora.setEstado("PR");
        calculadora.setValorProduto(100.0f);
        float imposto = calculadora.calcularImposto();
        assertEquals(18.0f, imposto, 0.01f);
    }

    @Test
    public void testParaPE() {
        calculadora.setEstado("PE");
        calculadora.setValorProduto(100.0f);
        float imposto = calculadora.calcularImposto();
        assertEquals(18.0f, imposto, 0.01f);
    }

    @Test
    public void testParaPI() {
        calculadora.setEstado("PI");
        calculadora.setValorProduto(100.0f);
        float imposto = calculadora.calcularImposto();
        assertEquals(18.0f, imposto, 0.01f);
    }

    @Test
    public void testParaRN() {
        calculadora.setEstado("RN");
        calculadora.setValorProduto(100.0f);
        float imposto = calculadora.calcularImposto();
        assertEquals(18.0f, imposto, 0.01f);
    }

    @Test
    public void testParaRS() {
        calculadora.setEstado("RS");
        calculadora.setValorProduto(100.0f);
        float imposto = calculadora.calcularImposto();
        assertEquals(18.0f, imposto, 0.01f);
    }

    @Test
    public void testParaRJ() {
        calculadora.setEstado("RJ");
        calculadora.setValorProduto(100.0f);
        float imposto = calculadora.calcularImposto();
        assertEquals(18.0f, imposto, 0.01f);
    }

    @Test
    public void testParaRO() {
        calculadora.setEstado("RO");
        calculadora.setValorProduto(100.0f);
        float imposto = calculadora.calcularImposto();
        assertEquals(17.5f, imposto, 0.01f);
    }

    @Test
    public void testParaRR() {
        calculadora.setEstado("RR");
        calculadora.setValorProduto(100.0f);
        float imposto = calculadora.calcularImposto();
        assertEquals(17.0f, imposto, 0.01f);
    }

    @Test
    public void testParaSC() {
        calculadora.setEstado("SC");
        calculadora.setValorProduto(100.0f);
        float imposto = calculadora.calcularImposto();
        assertEquals(17.0f, imposto, 0.01f);
    }
    @Test
    public void testParaSP() {
        calculadora.setEstado("SP");
        calculadora.setValorProduto(150.0f);
        float imposto = calculadora.calcularImposto();
        assertEquals(27.0f, imposto, 0.01f);
    }


    @Test
    public void testParaSE() {
        calculadora.setEstado("SE");
        calculadora.setValorProduto(100.0f);
        float imposto = calculadora.calcularImposto();
        assertEquals(18.0f, imposto, 0.01f);
    }

    @Test
    public void testParaTO() {
        calculadora.setEstado("TO");
        calculadora.setValorProduto(150.0f);
        float imposto = calculadora.calcularImposto();
        assertEquals(27.0f, imposto, 0.01f);

    }
    @Test
    public void testEstadoValidoInexistente() {
        String estado = calculadora.getEstado();
        assertFalse(calculadora.estadoValido(estado));

    }
    @Test
    public void testGetValorProduto() {
        float valorProduto = calculadora.getValorProduto();
        assertEquals(100.0f, valorProduto, 0.01f);
    }

    @Test
    public void testSetEstadoComEstadoInvalido() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculadora.setEstado("XX");
        });
    }

    @Test
    public void testSetValorProdutoComValorInvalido() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculadora.setValorProduto(-50.0f);

        });
    }

}
