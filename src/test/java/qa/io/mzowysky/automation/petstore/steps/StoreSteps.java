package qa.io.mzowysky.automation.petstore.steps;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import qa.io.mzowysky.automation.petstore.actions.StoreAction;
import qa.io.mzowysky.automation.petstore.builder.StoreBuilder;

public class StoreSteps {
	
	private Integer id;
	private Integer petId;
	private String body;

	@Autowired
	StoreAction storeAction;

	@Autowired
	StoreBuilder storeBuilder;

	// Inventario por status

	@Dado("que eu queira buscar os inventario dos pets")
	public void queEuQueiraBuscarOsInventarioDosPets() {
	System.out.println("Buscando inventario dos pets");
	}

	@Quando("eu clicar no botão inventory")
	public void euClicarNoBotãoInventory() throws IOException{
	System.out.println("Clicando no botão inventory");
	storeAction.inventoryStore();

	}

	@Então("terei o inventário completo dos pets")
	public void tereiOInventárioCompletoDosPets() {
	System.out.println("Inventario retornado com sucesso");
	}

	// Chamada do pet

	@Dado("que eu queira fazer uma chamada de um determinado animal")
	public void queEuQueiraFazerUmaChamadaDeUmDeterminadoAnimal() {
	System.out.println("Fazendo uma chamada de um animal");
	}

	@Quando("eu inserir as informações necessárias {int}, {int}, {int}, {string}, {string}, {string}")
	public void euInserirAsInformaçõesNecessárias(Integer id, Integer petId, Integer quantity, String shipDate,
	String status, String complete) {
	body = storeBuilder.orderPetStore(id, petId, quantity, shipDate, status, true);
	System.out.println("Inserindo as informações");
	System.out.println(body);
	}

	@Quando("clicar em executar")
	public void clicarEmExecutar() throws IOException{
	storeAction.orderStore(body);
	}

	@Então("terei o retorno da chamada com sucesso")
	public void tereiORetornoDaChamadaComSucesso() {
	System.out.println("Chamada retornada com sucesso");
	}

	// Busca da compra

	@Dado("que eu queira buscar uma compra")
	public void queEuQueiraBuscarUmaCompra() {
	System.out.println("Quero buscar uma compra");
	}

	@Quando("eu preencher os dados necessários corretamente {int}")
	public void euPreencherOsDadosNecessáriosCorretamente(Integer petId) {
	this.petId = petId;
	System.out.println("Inserindo os dados");
	}

	@Quando("clicar no botão search")
	public void clicarNoBotãoSearch() throws IOException {
	storeAction.findStore(petId);
	System.out.println("Clicando em search");
	}

	@Então("Terei o retorno da compra com sucesso")
	public void tereiORetornoDaCompraComSucesso() {
	System.out.println("Compra retornada com sucesso");

	}

	// Deletar compra

	@Dado("que eu queira deletar uma compra")
	public void queEuQueiraDeletarUmaCompra() {
	System.out.println("Quero deletar uma compra");
	}

	@Quando("eu inserir os dados corretamente {int}")
	public void euInserirOsDadosCorretamente(Integer id) {
	System.out.println("Inserindo os dados");
	this.id = id;
	}

	@Quando("clicar no execute")
	public void clicarNoExecute() throws IOException {
	System.out.println("Clicando no execute");
	storeAction.deleteStore(id);
	}

	@Então("terei a compra excluida com sucesso")
	public void tereiACompraExcluidaComSucesso() {
	System.out.println("Compra excluida com sucesso");

	}
	}


