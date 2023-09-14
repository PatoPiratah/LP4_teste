public class IMC {
    private boolean sexo = true;
    private String result;
    private double imc;
    private double altura;
    private double peso;

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String calcularIMC() {
        imc = peso / (altura * altura);

        if (sexo) {
            if (imc < 20.7) {
                result = "abaixo do peso";
            } else if (imc < 26.4) {
                result = "no peso normal";
            } else if (imc < 27.8) {
                result = "marginalmente acima do peso";
            } else if (imc < 31.1) {
                result = "acima do peso ideal";
            } else {
                result = "obeso";
            }
        } else {
            if (imc < 19.1) {
                result = "abaixo do peso";
            } else if (imc < 25.8) {
                result = "no peso normal";
            } else if (imc < 27.3) {
                result = "marginalmente acima do peso";
            } else if (imc < 32.3) {
                result = "acima do peso ideal";
            } else {
                result = "obeso";
            }
        }
        return result;
    }
}