package je09_javabeans;

/**
 * Classe Aluno: Representa um aluno com nome e idade.
 * Segue o padrão JavaBeans com atributos privados e getters/setters.
 *
 * @author SeuNomeAqui
 * @version 1.0
 */
public class Aluno {
    // Atributos privados (encapsulamento)
    private String nome;  // Corrigido de "none" para "nome"
    private int idade;

    // Construtor padrão (necessário para JavaBeans)
    public Aluno() {
        this.nome = "Sem nome"; // Valor padrão
        this.idade = 0;        // Valor padrão
    }

    // Construtor com parâmetros (opcional, para facilitar)
    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Getter para nome
    public String getNome() {
        return nome;
    }

    // Setter para nome (com validação básica)
    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        } else {
            this.nome = "Sem nome"; // Valor padrão se inválido
        }
    }

    // Getter para idade
    public int getIdade() {
        return idade;
    }

    // Setter para idade (com validação)
    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        } else {
            this.idade = 0; // Valor padrão se inválido
        }
    }
}
