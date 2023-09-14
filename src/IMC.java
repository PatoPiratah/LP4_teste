public class IMC {
   private boolean sexo=true;
   private Double altura;
   private Double peso;
   private Double valor;
   private String result;

    public boolean isSexo() {
        return sexo;
    }

    public Double getAltura() {
        return altura;
    }

    public Double getPeso() {
        return peso;
    }

    public Double getValor() {
        return valor;
    }

    public String getResult() {
        return result;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String calcularIMC(){

        valor = peso / (altura * altura);

    if(sexo){

        if(valor < 20.7){
            result = "Abaixo do peso Masculino!";
        }
        else if(valor < 26.4){
            result = "Peso normal Masculino!";
        }
        else if(valor < 27.8){
            result = "Marginalmente acima do peso Masculino!";
        }
        else if(valor < 31.1){
            result = "Acima do peso ideal Masculino!";
        }
        else {
            result = "Obesidade Masculino!";
        }
    }
    else{
        if(valor < 19.1){
            result = "Abaixo do peso Feminino!";
        }
        else if(valor < 25.8){
            result = "Peso normal Feminino!";
        }
        else if(valor < 27.3){
            result = "Marginalmente acima do peso Feminino!";
        }
        else if(valor < 32.3){
            result = "Acima do peso ideal Feminino!";
        }else{
            result = "Obesidade Feminino!";
        }
    }
       return result;
    }
}