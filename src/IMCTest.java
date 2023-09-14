import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IMCTest {

    @Test
    void deveRetornarHomemAbaixoDoPeso() {

        IMC pessoa = new IMC();
        pessoa.setPeso(50.0);
        pessoa.setAltura(1.65);
        pessoa.setSexo(true);
        assertEquals("Abaixo do peso Masculino!", pessoa.calcularIMC());
    }

    @Test
    void deveRetornarHomemPesoNormal() {
        IMC pessoa = new IMC();
        pessoa.setPeso(75.0);
        pessoa.setAltura(1.70);
        pessoa.setSexo(true);
        assertEquals("Peso normal Masculino!", pessoa.calcularIMC());
    }

    @Test
    void deveRetornarHomemMarginalmenteAcimaDoPeso() {
        IMC pessoa = new IMC();
        pessoa.setPeso(81.0);
        pessoa.setAltura(1.75);
        pessoa.setSexo(true);
        assertEquals("Marginalmente acima do peso Masculino!", pessoa.calcularIMC());
    }

    @Test
    void deveRetornarHomemAcimaDoPesoIdeal() {
        IMC pessoa = new IMC();
        pessoa.setPeso(83.0);
        pessoa.setAltura(1.70);
        pessoa.setSexo(true);
        assertEquals("Acima do peso ideal Masculino!", pessoa.calcularIMC());
    }

    @Test
    void deveRetornarHomemObeso() {
        IMC pessoa = new IMC();
        pessoa.setPeso(120.0);
        pessoa.setAltura(1.90);
        pessoa.setSexo(true);
        assertEquals("Obesidade Masculino!", pessoa.calcularIMC());
    }

    @Test
    void deveRetornarMulherAbaixoDoPeso() {

        IMC pessoa = new IMC();
        pessoa.setPeso(50.0);
        pessoa.setAltura(1.65);
        pessoa.setSexo(false);
        assertEquals("Abaixo do peso Feminino!", pessoa.calcularIMC());
    }

    @Test
    void deveRetornarMulherPesoNormal() {
        IMC pessoa = new IMC();
        pessoa.setPeso(70.0);
        pessoa.setAltura(1.70);
        pessoa.setSexo(false);
        assertEquals("Peso normal Feminino!", pessoa.calcularIMC());
    }

    @Test
    void deveRetornarMulherMarginalmenteAcimaDoPeso() {
        IMC pessoa = new IMC();
        pessoa.setPeso(81.0);
        pessoa.setAltura(1.75);
        pessoa.setSexo(false);
        assertEquals("Marginalmente acima do peso Feminino!", pessoa.calcularIMC());
    }

    @Test
    void deveRetornarMulherAcimaDoPesoIdeal() {
        IMC pessoa = new IMC();
        pessoa.setPeso(83.0);
        pessoa.setAltura(1.70);
        pessoa.setSexo(false);
        assertEquals("Acima do peso ideal Feminino!", pessoa.calcularIMC());
    }

    @Test
    void deveRetornarMulherObeso() {
        IMC pessoa = new IMC();
        pessoa.setPeso(120.0);
        pessoa.setAltura(1.90);
        pessoa.setSexo(false);
        assertEquals("Obesidade Feminino!", pessoa.calcularIMC());
    }

}