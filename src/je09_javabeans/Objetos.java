package je09_javabeans;

public class Objetos {
    public static void main(String[] args) {
        // Criando um objeto Aluno
        Aluno felipe = new Aluno();

        // Usando setters para definir valores
        felipe.setNome("Felipe Silva");
        felipe.setIdade(20);

        // Usando getters para exibir valores
        System.out.println("Nome do aluno: " + felipe.getNome());
        System.out.println("Idade do aluno: " + felipe.getIdade());

        // Testando validação do setter
        felipe.setIdade(-5); // Não vai aceitar (idade fica 0)
        felipe.setNome("");  // Não vai aceitar (nome fica "Sem nome")
        System.out.println("\nApós validações:");
        System.out.println("Nome do aluno: " + felipe.getNome());
        System.out.println("Idade do aluno: " + felipe.getIdade());

        // Criando outro aluno com construtor
        Aluno maria = new Aluno("Maria Oliveira", 18);
        System.out.println("\nOutro aluno:");
        System.out.println("Nome: " + maria.getNome() + ", Idade: " + maria.getIdade());
    }
}
