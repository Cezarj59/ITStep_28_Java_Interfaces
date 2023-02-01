package atividadeBanco.interfaces;

public interface iConta {

    public void sacar(double valor);

    public void depositar(double valor);

    public double getSaldo();
}
