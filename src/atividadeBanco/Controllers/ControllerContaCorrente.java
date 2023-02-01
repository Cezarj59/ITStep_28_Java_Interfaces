package atividadeBanco.Controllers;

import atividadeBanco.classes.ContaCorrente;
import atividadeBanco.dataBase.*;
import java.sql.*;

public class ControllerContaCorrente {

    public static ContaCorrente cadastrar() {
        ContaCorrente d = new ContaCorrente();
        System.out.println("\nCADASTRAR Conta Corrente\n");

        System.out.print("Informe o Nome: ");
        d.setNome(Receber.texto());
        System.out.print("Informe a Agência: ");
        d.setAgencia(Receber.texto());
        System.out.print("Informe a Conta: ");
        d.setConta(Receber.texto());
        System.out.print("Informe o Login: ");
        d.setLogin(Receber.texto());
        System.out.print("Informe a Senha: ");
        d.setSenha(Receber.texto());

        return d;
    }

    public static void addContaCorrente(ContaCorrente d) {
        Connection conn = BancoDados.conectar();

        try {
            String sql = "INSERT INTO ContaCorrente (senha,login,nome,conta,agencia) VALUES (?,?,?,?,?)";

            PreparedStatement statement = conn.prepareStatement(sql);

            statement.setString(1, d.getSenha());
            statement.setString(2, d.getLogin());
            statement.setString(3, d.getNome());
            statement.setString(4, d.getConta());
            statement.setString(5, d.getAgencia());

            if (statement.executeUpdate() > 0) {
                System.out.println("\n--------------------------------");
                System.out.println("Conta Corrente Cadastrado com Sucesso!!!");
                System.out.println("--------------------------------\n");
            } else {
                System.err.println("\n------------------------------");
                System.err.println("Falha ao Cadastrar o Conta Corrente!!!");
                System.err.println("------------------------------\n");
            }

        } catch (SQLException e) {
            System.err.println(e);
        }

        BancoDados.fecha(conn);
    }
}
