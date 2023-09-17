
public class CalculadoraImposto {
    private String estado;
    private float valorProduto;


    public CalculadoraImposto(String estado, float valorProduto) {
        this.estado = estado;
        this.valorProduto = valorProduto;
    }
    public boolean estadoValido(String estado) {
        return validarEstado(estado);
    }
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        if (validarEstado(estado)) {
            this.estado = estado;
        } else {
            throw new IllegalArgumentException("Estado não encontrado na lista de alíquotas");
        }
    }

    public float getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(float valorProduto) {
        if (valorProduto > 0) {
            this.valorProduto = valorProduto;
        } else {
            throw new IllegalArgumentException("O valor do produto deve ser maior que zero");
        }
    }

    public float calcularImposto() {
        float imposto = 0.0f;

        if ("AC".equals(estado)) {
            imposto = valorProduto * 0.17f;
        } else if ("AL".equals(estado)) {
            imposto = valorProduto * 0.17f;
        } else if ("AM".equals(estado)) {
            imposto = valorProduto * 0.18f;
        } else if ("AP".equals(estado)) {
            imposto = valorProduto * 0.18f;
        } else if ("BA".equals(estado)) {
            imposto = valorProduto * 0.18f;
        } else if ("CE".equals(estado)) {
            imposto = valorProduto * 0.18f;
        } else if ("DF".equals(estado)) {
            imposto = valorProduto * 0.18f;
        } else if ("ES".equals(estado)) {
            imposto = valorProduto * 0.17f;
        } else if ("GO".equals(estado)) {
            imposto = valorProduto * 0.17f;
        } else if ("MA".equals(estado)) {
            imposto = valorProduto * 0.18f;
        } else if ("MT".equals(estado)) {
            imposto = valorProduto * 0.17f;
        } else if ("MS".equals(estado)) {
            imposto = valorProduto * 0.17f;
        } else if ("MG".equals(estado)) {
            imposto = valorProduto * 0.18f;
        } else if ("PA".equals(estado)) {
            imposto = valorProduto * 0.17f;
        } else if ("PB".equals(estado)) {
            imposto = valorProduto * 0.18f;
        } else if ("PR".equals(estado)) {
            imposto = valorProduto * 0.18f;
        } else if ("PE".equals(estado)) {
            imposto = valorProduto * 0.18f;
        } else if ("PI".equals(estado)) {
            imposto = valorProduto * 0.18f;
        } else if ("RN".equals(estado)) {
            imposto = valorProduto * 0.18f;
        } else if ("RS".equals(estado)) {
            imposto = valorProduto * 0.18f;
        } else if ("RJ".equals(estado)) {
            imposto = valorProduto * 0.18f;
        } else if ("RO".equals(estado)) {
            imposto = valorProduto * 0.175f;
        } else if ("RR".equals(estado)) {
            imposto = valorProduto * 0.17f;
        } else if ("SC".equals(estado)) {
            imposto = valorProduto * 0.17f;
        } else if ("SE".equals(estado)) {
            imposto = valorProduto * 0.18f;
        } else if ("SP".equals(estado)) {
            imposto = valorProduto * 0.18f;
        } else if ("TO".equals(estado)) {
            imposto = valorProduto * 0.18f;
        }
        return imposto;
    }

    private boolean validarEstado(String estado) {
        String[] estadosValidos = {
                "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS",
                "MG", "PA", "PB", "PR", "PE", "PI", "RN", "RS", "RJ", "RO", "RR", "SC", "SE", "TO", "SP"
        };

        for (String estadoValido : estadosValidos) {
            if (estadoValido.equals(estado)) {
                return true;
            }
        }
        return false;
    }
}