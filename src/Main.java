import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> homens = new LinkedList<>();
        List<String> mulheres = new LinkedList<>();


        for (int i = 0; i < 4; i++){
            System.out.println("Digite um nome: ");
            String pessoas = sc.next();

            System.out.println("É homem ou mulher?");
            String resposta = sc.next();

            if (resposta.equals("homem")){
                homens.add(pessoas);
            } else if (resposta.equals("mulher")){
                mulheres.add(pessoas);
            } else {
                System.out.println("Resposta incorreta.");
            }
        }

        System.out.println("Lista de homens: " + homens);
        System.out.println("Lista de mulheres: " + mulheres);

    }


}