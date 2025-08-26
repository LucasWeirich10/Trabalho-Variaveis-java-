//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {

        DecimalFormat formatoMoeda = new DecimalFormat("R$ #,##0.00");


        //Dados

        String nomeProduto = "Bota";
        double valorProduto = 399.99;
        int quantidadeProduto = 50;
        double imposto = 152.0 / 100;
        double margemLucro = 500.0 / 100;
        double valorTotalProduto = valorProduto * quantidadeProduto;
        double produtoImposto = (valorProduto - imposto * quantidadeProduto);
        double valorProdutoFinal = (produtoImposto + margemLucro * quantidadeProduto);

        //armazenamento De Dados

        System.out.println("Nome: " + nomeProduto);
        System.out.println("Valor do produto: " + formatoMoeda.format(valorProduto));
        System.out.println("Quantidade do produto: " + quantidadeProduto);
        System.out.println("Imposto do produto: " + imposto);
        System.out.println("Margem lucro do produto: " + margemLucro);

        //operacoes

        System.out.println("Valor total dos produtos: " + formatoMoeda.format(valorProduto * quantidadeProduto));
        System.out.println("valorTotalProduto: " + formatoMoeda.format(valorTotalProduto - imposto));
        System.out.println("Produto com imposto: " + formatoMoeda.format(valorProduto - imposto * quantidadeProduto));
        System.out.println("Valor final produto: " + formatoMoeda.format(produtoImposto + margemLucro * quantidadeProduto));

    }
}