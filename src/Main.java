import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("""
                ------------------------------------
                Bem vindo ao jogo de adivinhação!
                ------------------------------------
                Você tem 5 tentativas para adivinhar o numero.
                Boa Sorte!
                """);

        int secreto = new Random().nextInt(100);
        int numero = 0;
        int inicio = 0;
        int fim = 100;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um numero de " + inicio + " a " + fim);
            numero = leitura.nextInt();
            if (numero > secreto){
                System.out.println("Numero é menor");
                fim = numero;
            } else if (numero < secreto) {
                System.out.println("numero é maior");
                inicio = numero;
            }else {
                System.out.println("Para bens, você acertou!");
                break;
            }

        }

        if (numero!=secreto) {                      //Mensagem de derrota
            System.out.println("""
                    ---------------------
                    Não foi dessa vez :(
                    O numero era:\s""" +secreto);
        }





    }
}