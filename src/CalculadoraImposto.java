import java.util.HashMap;
import java.util.Map;

public class CalculadoraImposto {
    private String estado;
    private double valorProduto;

    public CalculadoraImposto(String estado, double valorProduto) {
        this.estado = estado;
        this.valorProduto = valorProduto;
    }

    public double calcularImposto() {
        Map<String, Double> estadosAlíquotas = new HashMap<>();
        estadosAlíquotas.put("AC", 0.17);
        estadosAlíquotas.put("AL", 0.17);
        estadosAlíquotas.put("AM", 0.18);
        estadosAlíquotas.put("AP", 0.18);
        estadosAlíquotas.put("BA", 0.18);
        estadosAlíquotas.put("CE", 0.18);
        estadosAlíquotas.put("DF", 0.18);
        estadosAlíquotas.put("ES", 0.17);
        estadosAlíquotas.put("GO", 0.17);
        estadosAlíquotas.put("MA", 0.18);
        estadosAlíquotas.put("MT", 0.17);
        estadosAlíquotas.put("MS", 0.17);
        estadosAlíquotas.put("MG", 0.18);
        estadosAlíquotas.put("PA", 0.17);
        estadosAlíquotas.put("PB", 0.18);
        estadosAlíquotas.put("PR", 0.18);
        estadosAlíquotas.put("PE", 0.18);
        estadosAlíquotas.put("PI", 0.18);
        estadosAlíquotas.put("RN", 0.18);
        estadosAlíquotas.put("RS", 0.18);
        estadosAlíquotas.put("RJ", 0.18);
        estadosAlíquotas.put("RO", 0.175);
        estadosAlíquotas.put("RR", 0.17);
        estadosAlíquotas.put("SC", 0.17);
        estadosAlíquotas.put("SP", 0.18);
        estadosAlíquotas.put("SE", 0.18);
        estadosAlíquotas.put("TO", 0.18);

        if (estadosAlíquotas.containsKey(estado)) {
            double aliquota = estadosAlíquotas.get(estado);
            double imposto = valorProduto * aliquota;
            return imposto;
        } else {
            return -1;
        }
    }
}