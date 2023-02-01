package atividadeBanco.classes;

public class Conta {

    private String nome;
    private String agencia;
    private String conta;
    private double saque;
    private double deposito;
    private double saldo;

    public Conta() {
    }

    public Conta(String nome, String agencia, String conta, double saque, double deposito, double saldo) {
        this.nome = nome;
        this.agencia = agencia;
        this.conta = conta;
        this.saque = saque;
        this.deposito = deposito;
        this.saldo = saldo;
    }

    public Conta(String nome, String agencia, String conta, double saldo) {
        this.nome = nome;
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public double getSaque() {
        return saque;
    }

    public void setSaque(double saque) {
        this.saque = saque;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    

}
