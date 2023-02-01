package atividadeBanco.classes;

import atividadeBanco.interfaces.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ContaPJ extends Conta implements iConta, iLogin {

    private String senha;
    private String usuario;

    public ContaPJ() {
    }

    public ContaPJ(String senha, String usuario) {
        this.senha = senha;
        this.usuario = usuario;
    }

    public ContaPJ(String senha, String usuario, String nome, String agencia, String conta, double saque, double deposito, double saldo) {
        super(nome, agencia, conta, saque, deposito, saldo);
        this.senha = senha;
        this.usuario = usuario;
    }

   

    public ContaPJ(String nome, String agencia, String conta, double saldo) {
        super(nome, agencia, conta, saldo);
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

    private boolean autenticar() {
        return senha.equals("admin");
    }

    private boolean autenticar2() {
        return senha.equals("0000");
    }

    private void informaSenha() {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite a Senha: ");
        String senha = read.nextLine();

        setSenha(senha);
    }

    private void informaSenha2() {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite a Senha Secundaria: ");
        String senha = read.nextLine();

        setSenha(senha);
    }

    @Override
    public double getSaldo() {
        informaSenha();
        if (autenticar()) {
            return super.getSaldo();

        } else {
            System.err.println("\nSenha ou Login invalidos!!!\n");
            getSaldo();
        }
        return 0;
    }

    @Override
    public void sacar(double valor) {
        informaSenha();
        boolean senha1 = autenticar();
        informaSenha2();
        boolean senha2 = autenticar2();

        if (senha1 && senha2) {
            if (super.getSaldo() >= valor) {
                System.out.println("\n\nSaque efetuado com sucesso!\n\n");
                super.setSaldo(super.getSaldo() - valor);

            } else {
                System.err.println("Saldo insuficiente para realizar o saque!");
            }
        } else {
            System.err.println("\nSenha ou Login invalidos!!!\n");
            getSaldo();
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
