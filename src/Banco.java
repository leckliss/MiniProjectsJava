import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        double saldo = 1000;
        int vezes = 0;

        System.out.println("Olá seja bem-vindo, qual o seu nome?");
        String nome = leitura.nextLine();

        System.out.println("""
                    
                    BANCO LECKLIS
                    
                    CONTA: 001
                    
                    NOME: """ + nome +
                        """
                        
                        SALDO: """ + saldo

            );

            while (vezes != 4){
                System.out.println(
                        """
                    
                    O QUE GOSTARIA DE FAZER?
                    
                    1 - CONSULTAR SALDO
                    2 - DEPOSITAR VALOR
                    3 - SACAR VALOR
                    4 - SAIR                
                    """
                    );
            int opcao = leitura.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("SALDO ATUAL: " + saldo);
                    break;
                case 2:
                    System.out.println("DIGITE VALOR A SER DEPOSITADO: ");
                    double depoisito = leitura.nextDouble();
                    saldo = saldo + depoisito;
                    System.out.println("SALDO ATUALIZADO: " + saldo);
                    break;
                case 3:

                    System.out.println("DIGITE VALOR A SER SACADO: ");
                    double saque = leitura.nextDouble();
                    if (saque > saldo){
                        System.out.println("SALDO INSUFICIENTE PARA SER SACADO");
                        break;
                    }else {
                        saldo = saldo - saque;
                        System.out.println("SALDO ATUALIZADO: " + saldo);
                        break;
                    }
                case 4:
                    System.out.println("OBRIGADO POR UTILIZAR NOSSO BANCO, VOLTE SEMPRE!");
                    vezes = 4;
                    break;
                default:
                    System.out.println("OPÇÃO INVALIDA");
            }

        }
    }
}
