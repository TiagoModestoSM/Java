public class App4{
public static void main(String[] args) {
    Pessoa user1 = new Pessoa("Tiago");
    Pessoa user2 = new Pessoa("Sara");

    user1.User();
}

}

class Pessoa{
    String nome;

    public Pessoa(String nome){
        this.nome = nome;
    }
    public void User(){
        System.out.println("Usuário " + this.nome + " Criado");
    }
}