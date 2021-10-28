import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
       
        Vendedor lais = new Vendedor();
        Vendedor joao = new Vendedor();
        Cliente marcos = new Cliente();
        Cliente henrique = new Cliente();
       

        joao.cargaHoraria = "8 horas diárias";
        joao.carteiraDeTrabalho = "9889798798987";
        joao.cpf = "0123456789";
        joao.dataDeNascimento = LocalDate.of(2000, 9,  6);
        joao.nome = "João Silva";
        joao.endereco = "Rua dos Guri";
        joao.salario = "R$ 1.200,00";  
        joao.telefone = "55 51 9 9999 9999";
        joao.rg = "123456789465";
        joao.comissaoVenda = "5%";

        lais.cargaHoraria = "10 horas diárias";
        lais.carteiraDeTrabalho = "87845512312";
        lais.comissaoVenda = "5%";
        lais.cpf = "456 4565 123 22";
        lais.dataDeNascimento = LocalDate.of(1990, 5, 10);
        lais.endereco = "Rua das Gurias";
        lais.nome = " Lais Mueller";
        lais.rg = "123564887998";
        lais.salario = "R$ 1.200,00";
        lais.telefone = "55 51 7 7777 7777";

        marcos.cpf = "123 456 789 99";
        marcos.dataUltimaCompra = LocalDate.now();
        marcos.email = "marcos.email@gmail.com";
        marcos.endereco = "Rua dos Guri";
        marcos.nome = "Marcos da Silva";
        marcos.telefone = "55 51 8 8888 8888";

        henrique.cpf = "000 000 000 69";
        henrique.dataUltimaCompra = LocalDate.now();
        henrique.email = "henrique.email@gmail.com";
        henrique.endereco = "Rua dos Guri";
        henrique.nome = "Henrique Soares";
        henrique.telefone = "55 51 6 66666 6666";


        // System.out.println(joao.nome);
        // System.out.println(marcos.nome);
        
        Venda venda1 = new Venda();
        Venda venda2 = new Venda();
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();


        venda1.modeloPagamento = "Cartão de Crédito";
        venda1.quantidadeProduto = 10;
        venda1.valorProdutoVendido = 60;
        venda1.valorTotalVenda = (venda1.valorProdutoVendido * venda1.quantidadeProduto);
        venda1.notaFiscal = "1222";
        venda1.dataDeVenda = LocalDate.of(2021, 10, 27);

        venda2.modeloPagamento = "Dinheiro";
        venda2.dataDeVenda = LocalDate.of(2021, 10, 27);
        venda2.notaFiscal = "1337";
        venda2.quantidadeProduto = 2;
        venda2.valorProdutoVendido = 1200;
        venda2.valorTotalVenda = (venda2.quantidadeProduto * venda2.valorProdutoVendido); 

        produto1.tipoProduto = "cama";
        produto1.codigoProduto = "123123-5";
        produto1.corProduto = "Azul";
        produto1.marcaProduto = "Os Guris Empresários";
        produto1.nomeProduto = "Cama dos Guri";
        produto1.valorProduto = 1200;

        produto2.codigoProduto = "252525-6";
        produto2.corProduto = "Cinza";
        produto2.marcaProduto = "Os Guri Empresários";
        produto2.nomeProduto = "Travesseiro dos Guri";
        produto2.valorProduto = 60;
        produto2.tipoProduto = "Travesseiro";
       
        marcos.venda = venda1;
        joao.venda = venda1;        

        lais.venda = venda2;
        henrique.venda = venda2;

        

        

        String vendaClienteMarcos =  String.format("O cliente %s, na data %s, realizou a compra no %s, do produto %s, comprando %s unidades deste produto, cada produto a %s Reais, com o preco total sendo %s Reais, gerando a nota fiscal número %s. ", marcos.nome, venda1.dataDeVenda, venda1.modeloPagamento, produto1.nomeProduto,venda1.quantidadeProduto, venda1.valorProdutoVendido, venda1.valorTotalVenda, venda1.notaFiscal);

        String vendaVendedorJoao = String.format(" O vendedor %s, efetuou a venda para o cliente %s, na data %s, recebendo uma comissão de %s em cima da venda, gerando a nota fiscal %s. ", joao.nome, marcos.nome, venda1.dataDeVenda, joao.comissaoVenda, joao.venda.notaFiscal);


        String vendaClienteHenrique = String.format("O cliente %s, portador do cpf %s, na data %s, realizou a compra no %s, comprando o produto %s, solicitando %s unidades do produto, cada produto a %s, com o preco total sendo %s Reais, gerando a nota fiscal %s", henrique.nome, henrique.cpf, venda2.dataDeVenda ,venda2.modeloPagamento, produto2.nomeProduto, venda2.quantidadeProduto, venda2.valorProdutoVendido, venda2.valorTotalVenda, venda2.notaFiscal);

        String vendaVendedoraLais = String.format(" A vendedora %s, efetuou a venda para o cliente %s, na data %s, recebendo uma comissão de %s em cima da venda,  com o valor total de venda sendo de %s, gerando a nota fiscal %s.  ", lais.nome, henrique.nome, venda2.dataDeVenda, lais.comissaoVenda, venda2.valorTotalVenda, venda2.notaFiscal );
      
        System.out.println(vendaClienteMarcos);
        System.out.println();
        System.out.println(vendaVendedorJoao);
        System.out.println();
        System.out.println(vendaClienteHenrique);
        System.out.println();
        System.out.println(vendaVendedoraLais);
        


        

    }
}
