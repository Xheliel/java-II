import java.util.Scanner;

public class AtividadeI {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int op1 = 0;
        int op2 = 0;
        int op3 = 0;

        while(op1!=4) {
            System.out.println("\n = = = Menu Embalagens = = =");
            System.out.println("\n1 - Caixa de papelão");
            System.out.println("\n2 - Sacola plástica");
            System.out.println("\n3 - Embalagem de vidro");
            System.out.println("\n4 - Sair");
            op1=sc.nextInt();

            switch (op1) {
                case 1:
                    System.out.println("\nIdeal para transporte e armazenamento.");
                    break;

                case 2:
                    System.out.println("\nLeve e prática, mas pouco sustentável.");
                    break;

                case 3:
                    System.out.println("\nResistente e reutilizável.");
                    break;

                case 4:
                    System.out.println("\nSaindo.");
                    break;

                default:
                System.out.println("Opção invalída.");
            }
        }

        while(op2!=4) {
            System.out.println("\n = = = Menu Canetas = = =");
            System.out.println("\n1 - Caneta Esferográfica");
            System.out.println("\n2 - Caneta de Gel");
            System.out.println("\n3 - Caneta Tinteiro");
            System.out.println("\n4 - Sair");
            op2=sc.nextInt();

            switch (op2) {
                case 1:
                    System.out.println("\nEconômica e de longa duração.");
                    break;

                case 2:
                    System.out.println("\nTinta mais pigmentada e escrita suave.");
                    break;

                case 3:
                    System.out.println("\nClássica e elegante, usada para caligrafia.");
                    break;

                case 4:
                    System.out.println("\nSaindo.");
                    break;

                default:
                System.out.println("Opção invalída.");
            }
        }

        while(op3!=4) {
            System.out.println("\n = = = Menu Mochilas = = =");
            System.out.println("\n1 - Mochila Escolar");
            System.out.println("\n2 - Mochila de Viagem");
            System.out.println("\n3 - Mochila esportiva");
            System.out.println("\n4 - Sair");
            op3=sc.nextInt();

            switch (op3) {
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
