
package atividadeAula_28.classes;

import atividadeAula_28.interfaces.Som;
import atividadeAula_28.interfaces.Marinho;


public class Baleia extends Animal implements Marinho,Som{

    @Override
    public void nada() {
        System.out.println("Baleia Nada");    
    }

    @Override
    public void fazSom() {
        System.out.println("Baleia faz Som");
    }

}
