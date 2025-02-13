import java.util.Scanner;

public class AtividadeII {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int op1 = 0;

        while(op1!=4) {
            System.out.println("\n = = = Menu Canetas = = =");
            System.out.println("\n1 - Caneta Esferográfica");
            System.out.println("\n2 - Caneta de Gel");
            System.out.println("\n3 - Caneta Tinteiro");
            System.out.println("\n4 - Sair");
            op1=sc.nextInt();

            switch (op1) {
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
    }
}
