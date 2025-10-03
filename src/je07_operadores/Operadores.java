package je07_operadores;

public class Operadores {
    public static void main(String[] args) {
        int n1 = 10;  // Linha 1
        int n2 = 5;   // Linha 2
        n2 += n1;     // Linha 3
        System.out.println("n1: " + n1 + ", n2: " + n2);  // Para ver o resultado
    }

    //O que faz? É equivalente a n2 = n2 + n1;. Pega o valor atual de n2 (5), soma com n1 (10), e atribui o resultado de volta para n2.
    //Por quê usar +=? É mais curto e legível que escrever a soma completa. Outros exemplos: n2 -= 3 (subtrai), n2 *= 2 (multiplica), etc.
}
