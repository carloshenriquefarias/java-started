package je05_palavras_reservadas;

public class TiposPrimitivos {

    // Declaração de variáveis primitivas (com valores exemplo)
    byte idadeByte = 25;                // Pequeno inteiro
    short temperatura = -10;            // Inteiro médio
    int salario = 5000;                 // Inteiro comum
    long populacaoMundo = 8000000000L;  // Grande inteiro (note o L)
    float altura = 1.75f;               // Decimal médio (note o f)
    double pi = 3.14159;                // Decimal preciso
    char inicialNome = 'J';             // Um caractere
    boolean ehMaiorDeIdade = true;      // Verdadeiro/falso

    public static void main(String[] args) {
        // Criando um objeto para acessar as variáveis
        TiposPrimitivos exemplo = new TiposPrimitivos();

        // Imprimindo os valores
        System.out.println("=== Exemplos de Tipos Primitivos ===");
        System.out.println("byte: " + exemplo.idadeByte);
        System.out.println("short: " + exemplo.temperatura);
        System.out.println("int: " + exemplo.salario);
        System.out.println("long: " + exemplo.populacaoMundo);
        System.out.println("float: " + exemplo.altura);
        System.out.println("double: " + exemplo.pi);
        System.out.println("char: " + exemplo.inicialNome);
        System.out.println("boolean: " + exemplo.ehMaiorDeIdade);

        // Exemplo de uso: Operação simples
        int soma = exemplo.salario + 1000;
        System.out.println("\nSoma de salário + bônus: " + soma);
    }
}
