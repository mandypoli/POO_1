import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, c, delta;
        double x1, x2;

        System.out.println("*** Bhaskara ***");
        System.out.print("Valor de a: ");
        a = sc.nextInt();
        System.out.print("Valor de b: ");
        b = sc.nextInt();
        System.out.print("Valor de c: ");
        c = sc.nextInt();

        sc.close();

        delta = b*b - (4*a*c);

        double raizDeDelta = Math.sqrt(delta);

        x1 = (-b + raizDeDelta)/ (2 * a);
        x2 = (-b - raizDeDelta)/ (2 * a);

        System.out.println("*** Valores de x ***");
        System.out.println("x' : " + x1);
        System.out.println("x'' : " + x2);

    }
}
