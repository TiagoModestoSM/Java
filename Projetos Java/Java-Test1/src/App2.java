
import java.util.ArrayList;

public class App2 {
    public static void main(String[] args) throws Exception {
        int conjunto[] = {1, 2, 3, 4, 5};
        
        for (int i = 0; i < 5; i++) {
            System.out.println(conjunto[i]);
        }
        for (int i = 4; i>=0; i--){
            System.out.println(conjunto[i]);
        }

        //Array List

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Tiago");
        nomes.add("Rafael");
        nomes.add("Sara");
        nomes.add("Décio");
        nomes.add("Luciana");
        nomes.add("Ester");

        for(int i = 0; i <6; i ++){
        System.out.println(nomes.get(i));
        }


    }

}