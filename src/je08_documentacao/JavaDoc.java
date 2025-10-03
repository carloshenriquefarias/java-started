package je08_documentacao;

public class JavaDoc {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Integer resultado = calculadora.dividir(10, 5);  // Corrigido: vírgula e sem "divisor"
        System.out.println("Resultado da divisão: " + resultado);  // Saída: 2
    }
}