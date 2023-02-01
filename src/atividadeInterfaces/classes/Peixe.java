
package atividadeAula_28.classes;

import atividadeAula_28.interfaces.Marinho;


public class Peixe extends Animal implements Marinho{

    @Override
    public void nada() {
        System.out.println("Peixe Nada");
    }

}
