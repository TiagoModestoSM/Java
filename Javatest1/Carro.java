package Javatest1;
public class Carro{
    String modelo;
    public static void main(String[] args) {
        System.out.println("(Test)");
    }
    public Carro(String modelo){
        this.modelo = modelo;
        System.err.println("Carro Criado");
    }
    public String acelerar(){
        System.err.println("Acelerando o Carro: " + this.modelo);
        return "oi";
    }
}