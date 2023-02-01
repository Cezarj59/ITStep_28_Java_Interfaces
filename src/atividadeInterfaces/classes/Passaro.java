
package atividadeAula_28.classes;

import atividadeAula_28.interfaces.Voar;
import atividadeAula_28.interfaces.Som;
import atividadeAula_28.interfaces.Andar;


public class Passaro extends Animal implements Voar,Som,Andar{

    @Override
    public void voa() {
        System.out.println("Pássaro voa");
    }

    @Override
    public void fazSom() { 
        System.out.println("Pássaro faz som");
    }

    @Override
    public void anda() {
        System.out.println("Pássaro anda");
    }

}
