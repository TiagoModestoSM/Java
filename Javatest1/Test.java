package Javatest1;
public class Test {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Doblo");
        String result = meuCarro.acelerar();
        System.out.println(result);
    }
}
/*
 * public -> acessível de todo lugar
 * default -> padrão
 * private -> somente na mesma classe
 *  protected -> somente no mesmo package
 */
