package je10_controle_fluxo_excecao;

public class Excecao {
    /**
     * Divide dois números inteiros.
     * @param a O dividendo.
     * @param b O divisor.
     * @return O resultado da divisão.
     */
    public int dividir(int a, int b) {
        return a / b; // Pode gerar ArithmeticException se b for 0
    }

    public static void main(String[] args) {
        Excecao exemplo = new Excecao();

        // Teste com divisão por zero
        try {
            int resultado = exemplo.dividir(10, 0); // Vai gerar ArithmeticException
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Não pode dividir por zero!");
        } finally {
            System.out.println("Operação de divisão terminada.");
        }

        // Teste com divisão válida
        try {
            int resultado = exemplo.dividir(10, 2);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Não pode dividir por zero!");
        } finally {
            System.out.println("Operação de divisão terminada.");
        }
    }
}
