public class Exercicio1 {
    public static void main(String[] args) {

        String nome = "Maria de Souza";
        int idade = 28;
        int codigo = 1234;
        char sexo = 'F';
        String produto1 = "Computador";
        String produto2 = "Relogio";
        double precoProduto1 = 5900.18;
        double precoProduto2 = 415.25;

        System.out.println("*** Dados do(a) comprador(a) ***");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Código: " + codigo);
        System.out.println("Sexo: " + sexo);

        System.out.println("*** Lista de Produtos ***");
        System.out.println("Produto 1: " + produto1 + " | Preço: " + precoProduto1);
        System.out.println("Produto 1: " + produto2 + " | Preço: " + precoProduto2);

        System.out.println("*** Valor total das Compras ***");
        System.out.println("R$ " + (precoProduto1+precoProduto2));

    }
}
