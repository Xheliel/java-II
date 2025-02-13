import java.util.Scanner;

public class menuCalculo {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 0;

        while (op != 5) {
            System.out.println("\nDê o primeiro valor:");
            int n1 = sc.nextInt();
            System.out.println("\nAgora o segundo valor:");
            int n2 = sc.nextInt();

            System.out.println("\n= = = Menu Operações = = =");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Sair");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("\n= = = Soma = = =\nResultado: " + (n1 + n2) + "\n");
                    break;

                case 2:
                    System.out.println("\n= = = Subtração = = =\nResultado: " + (n1 - n2) + "\n");
                    break;

                case 3:
                    System.out.println("\n= = = Multiplicação = = =\nResultado: " + (n1 * n2) + "\n");
                    break;

                case 4:
                    System.out.println("\n= = = Divisão = = =\n Resultado: " + (n1 / n2) + "\n");
                    break;

                case 5:
                    System.out.println("\nEncerrando...\n");
                    break;

                default:
                    System.out.println("Opção inválida.\n");
            }
        }

        sc.close();
    }


}
