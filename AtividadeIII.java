import java.util.Scanner;

public class AtividadeIII {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int op1 = 0;

        while(op1!=4) {
            System.out.println("\n = = = Menu Mochilas = = =");
            System.out.println("\n1 - Mochila Escolar");
            System.out.println("\n2 - Mochila de Viagem");
            System.out.println("\n3 - Mochila esportiva");
            System.out.println("\n4 - Sair");
            op1=sc.nextInt();

            switch (op1) {
                case 1:
                    System.out.println("\nCompacta e ideal para estudantes.");
                    break;

                case 2:
                    System.out.println("\nEspaçosa, ideal para longas jornadas.");
                    break;

                case 3:
                    System.out.println("\nLeve, resistente e ergonômica.");
                    break;

                case 4:
                    System.out.println("\nSaindo.");
                    break;

                default:
                System.out.println("Opção invalída.");
            }
        }
    }
}
