
package Javatest1;

/**
 *
 * @author labig
 */
public class Humano extends SerVivo{
    public String nome;
    public Humano(){
        super(21);
        this.nome = "Tiago";
        
    }

    @Override
    public void respirar(){
        System.out.println(this.idade);
        System.out.println("Respirando...");
        System.out.println(nome);
    }

}
