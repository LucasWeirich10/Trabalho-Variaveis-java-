import com.sun.jdi.Value;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //dados

        String nome = "Lucas";
        int idade = 18;
        double salarioBruto = 5350;
        int mesesTrabalho = 12;
        int produtosComprados = 50;
        double valorProdutos = 50;
        double salarioAnualBruto = salarioBruto * mesesTrabalho;
        double desconto = 1550.0;
        double ValorProdutosFinal = produtosComprados * valorProdutos;
        double salarioFinal = (salarioAnualBruto - desconto);

        //armazenamento de dados

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salario Bruto: " + salarioBruto);
        System.out.println("Meses Trabalho: " + mesesTrabalho);
        System.out.println("Produtos Comprados: " + produtosComprados);
        System.out.println("Desconto: " + desconto);
        System.out.println("Valor Produto: " + ValorProdutosFinal);

        //operações

        System.out.println("Salario Anual Bruto: R$ " + salarioBruto * mesesTrabalho );
        System.out.println("salarioAnualLiquido: R$ " + (salarioAnualBruto - desconto));
        System.out.println("Produtos Comprados:" + produtosComprados + " Valor Gasto: R$" + ValorProdutosFinal);

        System.out.println("Nome: " + nome + " Seu salario Anual Liquido é " + salarioFinal + " apos a compra dos produtos e dos descontos.");



    }
}