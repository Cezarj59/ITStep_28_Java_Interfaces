package atividadeBanco.classes;

import atividadeBanco.interfaces.*;

public class ContaCorrente extends Conta implements iConta, iLogin {

    private double chequeEsp;
    private String senha;
    private String usuario;

    public ContaCorrente() {
    }

    public ContaCorrente(String senha, String usuario) {
        this.senha = senha;
        this.usuario = usuario;
    }

    public ContaCorrente(double chequeEsp) {
        this.chequeEsp = 1000;
    }

    public ContaCorrente(String senha, String usuario, String nome, String agencia, String conta, double saque, double deposito, double saldo) {
        super(nome, agencia, conta, saque, deposito, saldo);
        this.senha = senha;
        this.usuario = usuario;
    }

   
    
    public ContaCorrente(String nome, String agencia, String conta, double saldo) {
        super(nome, agencia, conta, saldo);
    }

   

    public double getChequeEsp() {
        return chequeEsp;
    }

    public void setChequeEsp(double chequeEsp) {
        this.chequeEsp = chequeEsp;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getLogin() {
        return usuario;
    }

    public void setLogin(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public double getSaldo() {

        return super.getSaldo();
    }

    @Override
    public void sacar(double valor) {
        if (super.getSaldo() + this.chequeEsp >= valor) {
            System.out.println("\n\nSaque efetuado com sucesso!\n\n");
            super.setSaldo(super.getSaldo() - valor);

        } else {
            System.err.println("Saldo insuficiente para realizar o saque!");
        }
    }

    @Override
    public void depositar(double valor) {
        if (valor <= 0) {
            System.err.println("Impossível depositar valor negativo!");
        } else {

            setSaldo(super.getSaldo() + valor);

            System.err.println("\n$$$ Deposito Efetuado com Sucesso!!! $$$\n");
        }
    }

    @Override
    public boolean logon(String usuario, String senha) {
        if (this.usuario.equals(usuario) && this.senha.equals(senha)) {
            System.out.println("Conta conectada!!!");
            return true;
        } else {
            System.out.println("Usuario ou senha inválido!!!");
            return false;

        }

    }

    @Override
    public boolean logof(String usuario) {
        System.out.println("Usuario desconectado!!!");
        return true;

    }
}
