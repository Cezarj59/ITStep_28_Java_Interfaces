package classroom_28;

import atividadeBanco.classes.ContaPJ;

public class Main {

    public static void main(String[] args) {
        ContaPJ a = new ContaPJ();
        a.depositar(1200);
        System.out.println("Saldo: " + a.getSaldo());
        a.sacar(100);
        System.out.println("Saldo: " + a.getSaldo());
    }

}
