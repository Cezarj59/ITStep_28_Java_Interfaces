
package atividadeAula_28.classes;

import atividadeAula_28.interfaces.Voar;
import atividadeAula_28.interfaces.Som;
import atividadeAula_28.interfaces.Andar;
import atividadeAula_28.interfaces.Marinho;


public class Pato extends Animal implements Voar,Som,Andar,Marinho{

    
    @Override
    public void voa() {
        System.out.println("Pato voa");
    }

    @Override
    public void fazSom() { 
        System.out.println("Pato faz som");
    }

    @Override
    public void anda() {
        System.out.println("Pato anda");
        
    }

    @Override
    public void nada() {
          System.out.println("Pato Nada");
    }
}
