import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IMCTest {

    @Test
    void deveRetornarHomemAbaixoDoPeso() {

        IMC pessoa = new IMC();
        pessoa.setPeso(50.0);
        pessoa.setAltura(1.65);
        pessoa.setSexo(true);
        assertEquals("abaixo do peso", pessoa.calcularIMC());
    }

    @Test
    void deveRetornarHomemPesoNormal() {
        IMC pessoa = new IMC();
        pessoa.setPeso(75.0);
        pessoa.setAltura(1.70);
        pessoa.setSexo(true);
        assertEquals("no peso normal", pessoa.calcularIMC());
        
    }

    @Test
    void deveRetornarHomemMarginalmenteAcimaDoPeso() {
        IMC pessoa = new IMC();
        pessoa.setPeso(81.0);
        pessoa.setAltura(1.75);
        pessoa.setSexo(true);
        assertEquals("marginalmente acima do peso", pessoa.calcularIMC());
    }

    @Test
    void deveRetornarHomemAcimaDoPesoIdeal() {
        IMC pessoa = new IMC();
        pessoa.setPeso(83);
        pessoa.setAltura(1.70);
        pessoa.setSexo(true);
        assertEquals("acima do peso ideal", pessoa.calcularIMC());
    }

    @Test
    void deveRetornarHomemObeso() {
        IMC pessoa = new IMC();
        pessoa.setPeso(120.0);
        pessoa.setAltura(1.90);
        pessoa.setSexo(true);
        assertEquals("obeso", pessoa.calcularIMC());
    }
}