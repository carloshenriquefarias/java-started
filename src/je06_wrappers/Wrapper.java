package je06_wrappers;

public class Wrapper {

    public static void main(String[] args) {
        // Autoboxing: int vira Integer automaticamente
        int primitivo = 42;
        Integer wrapper = primitivo;  // Automático!
        System.out.println("Wrapper de int: " + wrapper);

        // valueOf: String para wrapper
        Integer deString = Integer.valueOf("123");
        System.out.println("De string para Integer: " + deString);

        // parseInt: String para primitivo
        int deParse = Integer.parseInt("456");
        System.out.println("Parse de string para int: " + deParse);

        // toString: Número para string
        String comoTexto = Integer.toString(789);
        System.out.println("Número para string: " + comoTexto);

        // Exemplo com Double: Verificar NaN
        Double nan = Double.valueOf("abc");  // Erro? Não, valueOf joga exceção se inválido
        // Melhor usar try-catch para parses
        try {
            double pi = Double.parseDouble("3.14");
            System.out.println("Double de string: " + pi);
        } catch (NumberFormatException e) {
            System.out.println("Erro na conversão: " + e.getMessage());
        }

        // Unboxing: Wrapper vira primitivo
        Double altura = 1.75;
        double primitivoDouble = altura;  // Automático!
        System.out.println("Unboxing Double para double: " + primitivoDouble);
    }
}