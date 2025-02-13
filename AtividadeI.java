import java.util.Scanner;

public class AtividadeI {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int op1 = 0;

        while(op1!=4) {
            System.out.println("\n = = = Menu Embalagens = = =");
            System.out.println("\n1 - Caixa de papelão");
            System.out.println("\n2 - Sacola plástica");
            System.out.println("\n3 - Embalagem de vidro");
            System.out.println("\n4 - Sair");
            op1=sc.nextInt();

            switch (op1) {
                case 1:
                    System.out.println("\nIdeal para transporte e armazenamento.\n");
                    break;

                case 2:
                    System.out.println("\nLeve e prática, mas pouco sustentável.\n");
                    break;

                case 3:
                    System.out.println("\nResistente e reutilizável.\n");
                    break;

                case 4:
                    System.out.println("\nSaindo.\n");
                    break;

                default:
                System.out.println("Opção invalída.\n");
                
            }
        }
    }
}
