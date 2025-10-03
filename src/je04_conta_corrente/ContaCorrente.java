package je04_conta_corrente;

public class ContaCorrente {

    private int numeroConta; // Número da conta
    private int numeroAgencia; // Número da agencia
    private String nomeCliente;  // Nome do cliente da conta
    private String dataNascimentoCliente;  // Data de nascimento
    private double saldoDaConta; // Saldo da conta

    public void consultarSaldoAtualDaConta(int numeroConta){
        System.out.println("Seu saldo atual em R$ e:" + saldoDaConta + numeroConta);
    }

    public void depositar(Double valor){
        double novoSaldo = saldoDaConta + valor;
        System.out.println("O valor depositado e R$ e:" + novoSaldo);
    }

    public void sacar (Double valor){
        // variavel do metodo
        double novoSaldo = saldoDaConta - valor;
        System.out.println("Voce sacou:" + novoSaldo);
    }

    public void transferirParaOutraConta (Double valor){

    }


}
