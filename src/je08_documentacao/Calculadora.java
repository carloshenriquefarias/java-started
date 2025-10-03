package je08_documentacao;

/**
 * Classe Calculadora: Realiza operações matemáticas básicas.
 *
 * @author Carlos Henrique
 * @version 1.0
 */
public class Calculadora {

    /**
     * Divide dois números inteiros.
     *
     * @param dividendo O número a ser dividido (numerador).
     * @param divisor O número que divide (denominador). Não pode ser zero!
     * @return O resultado da divisão como Integer.
     * @throws ArithmeticException Se o divisor for zero.
     */
    Integer dividir(Integer dividendo, Integer divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Divisão por zero não permitida!");
        }
        return dividendo / divisor;
    }
}