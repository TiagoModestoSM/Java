package Javatest1;


public class Doblo implements Carro {
    final int LimiteVel = 150;
    public int VelAtual = 30;
    @Override // ---->Indicar que um método implementa outro método de uma classe superior
    public void acelerar(){
        if (this.VelAtual < this.LimiteVel){
            this.VelAtual += 10;
            System.err.println("Acelerando...");
        }
        
        System.out.println("Velocidade Atual: " + this.VelAtual);
    }
    @Override
    public void frear(){

    }
    @Override
    public  void parar(){

    }
}
