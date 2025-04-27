package com.willywonka;

import com.willywonka.model.Fornecedor;
import com.willywonka.model.Produto;
import com.willywonka.service.FornecedorService;
import com.willywonka.service.ProdutoService;


import java.util.List;

@SpringBootApplication
public class ErpApplication implements CommandLineRunner {

	@Autowired
	private FornecedorService fornecedorService;

	@Autowired
	private ProdutoService produtoService;

	public static void main(String[] args) {
		SpringApplication.run(ErpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Adicionando Fornecedores de exemplo
		Fornecedor fornecedor1 = new Fornecedor();
		fornecedor1.setNome("Fornecedor A");
		fornecedor1.setCnpj("12345678000199");
		fornecedor1.setEndereco("Rua 1, 100");
		fornecedor1.setTelefone("11123456789");

		Fornecedor fornecedor2 = new Fornecedor();
		fornecedor2.setNome("Fornecedor B");
		fornecedor2.setCnpj("98765432000199");
		fornecedor2.setEndereco("Rua 2, 200");
		fornecedor2.setTelefone("11987654321");

		fornecedorService.salvar(fornecedor1);
		fornecedorService.salvar(fornecedor2);

		// Adicionando Produtos de exemplo
		Produto produto1 = new Produto();
		produto1.setNome("Chocolate");
		produto1.setPreco(15.99);
		produto1.setDescricao("Chocolate ao leite");

		Produto produto2 = new Produto();
		produto2.setNome("Bala");
		produto2.setPreco(5.99);
		produto2.setDescricao("Bala de frutas");

		produtoService.salvar(produto1);
		produtoService.salvar(produto2);

		// Exibindo Fornecedores
		System.out.println("Lista de Fornecedores:");
		List<Fornecedor> fornecedores = fornecedorService.listar();
		fornecedores.forEach(fornecedor -> System.out.println(fornecedor.getNome()));

		// Exibindo Produtos
		System.out.println("\nLista de Produtos:");
		List<Produto> produtos = produtoService.listar();
		produtos.forEach(produto -> System.out.println(produto.getNome() + " - " + produto.getPreco()));
	}
}
