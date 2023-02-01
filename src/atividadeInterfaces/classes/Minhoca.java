
package atividadeAula_28.classes;

import atividadeAula_28.interfaces.Andar;


public class Minhoca extends Animal implements Andar{

    @Override
    public void anda() {
        System.out.println("Minhoca Anda");
    }

}
