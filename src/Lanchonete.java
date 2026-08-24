
import java.util.Scanner;

public class Lanchonete {

    public static void main(String[] args) {

        try (Scanner leia = new Scanner(System.in)) {

            String client, pedidoFinal = "";
            int qtdProd, qtdPedido;
            char opt = 'S';
            float conta = 0;

            System.out.println("Digite a quantidade de produtos que haverão no cardápio: ");
            qtdProd = leia.nextInt();
            leia.nextLine();

            String prod[] = new String[qtdProd];
            float price[] = new float[qtdProd];

            for (int i = 0; i < qtdProd; i++) {

                System.out.println("Digite o nome do " + (i + 1) + "° produto: ");
                prod[i] = leia.nextLine();

                System.out.println("Digite seu respectivo preço: ");
                price[i] = leia.nextFloat();
                leia.nextLine();

            }

            System.out.println(" ");
            System.out.println("---CARDÁPIO---");

            for (int i = 0; i < qtdProd; i++) {
                System.out.println("o " + prod[i] + "        R$ " + price[i]);
            }

            System.out.println(" ");

            while (opt == 'S') {
                conta = 0;

                System.out.print("Cliente: ");
                client = leia.nextLine();

                System.out.println("Pedido de " + client + ": ");

                for (int i = 0; i < qtdProd; i++) {
                    System.out.print("Quantidade de " + prod[i] + ": ");
                    qtdPedido = leia.nextInt();
                    leia.nextLine();

                    if (qtdPedido > 0) {
                        conta += qtdPedido * price[i];
                        pedidoFinal += prod[i] + " " + qtdPedido + "x R$" + price[i] + " =  R$" + (price[i] * qtdPedido) + " \n";
                    }
                }
            
            
                System.out.println(" ");
                System.out.println("Pedido de " + client + ": ");

                System.out.println(pedidoFinal);

                System.out.printf("Total da conta de %s: R$ %.2f%n", client, conta);

                System.out.println("Deseja registrar um novo cliente? Digite 'S' para continuar. ");
                opt = leia.next().charAt(0);
                leia.nextLine();

            }
        }
    }

}
