import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cadastro do Usuario 1 ---");
        System.out.print("Nome: ");
        String nome1 = sc.nextLine();
        System.out.print("CPF: ");
        long cpf1 = sc.nextLong();
        sc.nextLine(); // limpa a quebra de linha deixada pelo nextLong()
        System.out.print("Email: ");
        String email1 = sc.nextLine();

        System.out.println("\n--- Cadastro do Usuario 2 ---");
        System.out.print("Nome: ");
        String nome2 = sc.nextLine();
        System.out.print("CPF: ");
        long cpf2 = sc.nextLong();
        sc.nextLine();
        System.out.print("Email: ");
        String email2 = sc.nextLine();

        System.out.println("\n--- Cadastro do Usuario 3 ---");
        System.out.print("Nome: ");
        String nome3 = sc.nextLine();
        System.out.print("CPF: ");
        long cpf3 = sc.nextLong();
        sc.nextLine();
        System.out.print("Email: ");
        String email3 = sc.nextLine();

        System.out.println("\n--- Consulta de Usuario ---");
        System.out.print("Digite o CPF que deseja consultar: ");
        long cpfBusca = sc.nextLong();

        if (cpfBusca == cpf1) {
            System.out.println("\nUsuario encontrado:");
            System.out.println("Nome: " + nome1);
            System.out.println("CPF: " + cpf1);
            System.out.println("Email: " + email1);

        } else if (cpfBusca == cpf2) {
            System.out.println("\nUsuario encontrado:");
            System.out.println("Nome: " + nome2);
            System.out.println("CPF: " + cpf2);
            System.out.println("Email: " + email2);

        } else if (cpfBusca == cpf3) {
            System.out.println("\nUsuario encontrado:");
            System.out.println("Nome: " + nome3);
            System.out.println("CPF: " + cpf3);
            System.out.println("Email: " + email3);

        } else {
            System.out.println("\nNenhum usuario encontrado com esse CPF.");
        }

        sc.close();
    }
}