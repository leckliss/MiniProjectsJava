import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class numerosecreto {

    public static void main(String[] args) {


                int numAleatorio = new Random().nextInt(100);
  
                Scanner leitor = new Scanner(System.in);
                int tentativas = 0;
                int numDigitado = 0;

                while (tentativas < 5) {
                    System.out.print("Digite um número entre 0 e 100: ");
                    numDigitado = leitor.nextInt();
                    tentativas++;

                    if (numDigitado == numAleatorio) {
                        System.out.println("Parabéns, você acertou o número em " + tentativas + " tentativas!");
                        break;
                    } else if (numDigitado < numAleatorio) {
                        System.out.println("O número digitado é menor que o número gerado.");
                    } else {
                        System.out.println("O número digitado é maior que o número gerado.");
                    }
                }

                if (tentativas == 5 && numDigitado != numAleatorio) {
                    System.out.println("Você não conseguiu acertar o número em 05 tentativas. O número era: " + numAleatorio);
                }
            }
        }