
package atividadeAula_28.classes;

import atividadeAula_28.interfaces.Som;
import atividadeAula_28.interfaces.Andar;


public class Cachorro extends Animal implements Som,Andar{

    @Override
    public void fazSom() {
        System.out.println("Cachorro Late");
    }

    @Override
    public void anda() {
        System.out.println("Cachorro Anda");
    }

}
