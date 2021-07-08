package qa.io.mzowysky.automation.petstore.steps;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;

import io.cucumber.java.gl.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import qa.io.mzowysky.automation.petstore.actions.PetAction;
import qa.io.mzowysky.automation.petstore.builder.PetBuilder;

public class PetSteps {
	private Integer petId;
	private String body;
	private String status;
	private String name;
	@Autowired
	PetBuilder petBuilder;

	@Autowired
	PetAction petAction;

	// Adicionando Pet

	@Dado("que eu esteja na home e queira adicionar um novo pet na store")
	public void queEuEstejaNaHomeEQueiraAdicionarUmNovoPetNaStore() {
		System.out.println("Estou na home adicionando um pet");
	}

	@Quando("eu inserir os dados cadastrais necessários {string}, {string}, {string}, {string}, {string}")
	public void euInserirOsDadosCadastraisNecessários(String categoryName, String name, String photoUrls,
			String tagName, String status) {
		System.out.println("Inserindo os dados cadastrais");
		body = petBuilder.createPet(categoryName, name, photoUrls, tagName, status);
		System.out.println(body);
	}

	@Quando("clicar em insert")
	public void clicarEmInsert() throws IOException {
		System.out.println("Clicando em execute");
		petAction.createPet(body);
	}

	@Então("terei o pet cadastrado com sucesso")
	public void tereiOPetCadastradoComSucesso() {
		System.out.println("Pet cadastrado com sucesso");
	}

	// Upload da imagem

	@Dado("que eu esteja na home e queira adicionar uma foto do pet")
	public void queEuEstejaNaHomeEQueiraAdicionarUmaFotoDoPet() {
		System.out.println("Estou na home adicionando uma foto");
	}

	@Quando("eu inserir os dados necessários {int} , {string}")
	public void euInserirOsDadosNecessários(Integer petId, String photUrls) {
		System.out.println("Inserindo os dados necessários");
		this.petId = petId;
		body = petBuilder.image(photUrls);
		System.out.println(body);

	}

	@Quando("clicar em enviar")
	public void clicarEmEnviar() throws IOException{
		System.out.println("Clicando em enviar");
		this.petId = petId;
		petAction.imagePet(body, petId);
	}

	@Então("terei a imagem adicionada com sucesso")
	public void tereiAImagemAdicionadaComSucesso() {
		System.out.println("Imagem adicionada com sucesso");
	}

	// Atualizar pet na store

	@Dado("que eu esteja na home e desejo atualizar as informações do pet")
	public void queEuEstejaNaHomeEDesejoAtualizarAsInformaçõesDoPet() {
		System.out.println("Estou na home atualizando as informações");
	}

	@Quando("eu inserir o id do pet que sera atualizado {int}")
	public void euInserirOIdDoPetQueSeraAtualizado(Integer petId) {
		System.out.println("Inserdindo o id do pet");
		this.petId = petId;
	}

	@Quando("inserir os dados que serão alterados {string}, {string}")
	public void inserirOsDadosQueSerãoAlterados(String name, String status) {
		System.out.println("Inserindo os dados");
		body = petBuilder.updateData(name, status);
	}
	
	@Quando("clicar em update")
	public void clicarEmUpdate() throws IOException {
		petAction.updateDataPet(body, petId);
	}

	@Então("o perfil do pet atualizado na store")
	public void oPerfilDoPetAtualizadoNaStore() {
		System.out.println("Pefil  atualizado com sucesso");
	}

	// Buscando pet pelo id

	@Dado("que eu queira buscar um determinado pet")
	public void queEuQueiraBuscarUmDeterminadoPet() {
		System.out.println("Quero buscar um pet");
	}

	@Quando("eu inserir o id do pet {int}")
	public void euInserirOIdDoPet(Integer petId) {
		System.out.println("Inserindo o id do pet");
		this.petId = petId;
	}

	@Quando("clicar no botão search")
	public void clicarNoBotãoSearch() throws IOException{
		System.out.println("Clicando em search");
		petAction.findIdPet(petId);
	}

	@Então("terei o pet e suas informações encontradas com sucesso")
	public void tereiOPetESuasInformaçõesEncontradasComSucesso() {
		System.out.println("Pet encontrado com sucesso");
	}

	// Buscando pet pelo status

	@Dado("que eu esteja na home e queira saber determinado status de alguns pets")
	public void queEuEstejaNaHomeEQueiraSaberDeterminadoStatusDeAlgunsPets() {
		System.out.println("Estou na home buscando status dos pets");
	}

	@Quando("eu inserir o status desejado {string}")
	public void euInserirOStatusDesejado(String status) {
		System.out.println("Inserindo o status");
		this.status = status;
	}

	@Quando("clicar em search")
	public void clicarEmSearch() throws IOException {
		System.out.println("Pet encontrado com sucesso");
		petAction.findStatusPet(status);
	}

	@Então("terei o retorno dos pets que estão nesse status")
	public void tereiORetornoDosPetsQueEstãoNesseStatus() {
		System.out.println("Pet encontrado com sucesso");
	}

	// Excluindo pet

	@Dado("que eu queira excluir um pet")
	public void queEuQueiraExcluirUmPet() {
		System.out.println("Quero excluir um pet");
	}

	@Quando("eu inserir id do pet  {int}")
	public void euInserirIdDoPet(Integer petId) {
		System.out.println("Inserindo id do pet");
		this.petId = petId;
	}

	@Quando("clicar no botao execute")
	public void clicarNoBotaoExecute() throws IOException {
		System.out.println("Clicando em execute");
		petAction.deletePet(petId);
	}
	
	@Então("terei o pet excluido com sucesso")
	public void tereiOPetExcluidoComSucesso() {
		System.out.println("pet excluido com sucesso");
	}

	// Atualizando informações do pet

	@Dado("que eu esteja na home e queira atualizar as informações de um pet")
	public void queEuEstejaNaHomeEQueiraAtualizarAsInformaçõesDeUmPet() {
		System.out.println("Estou na home atualizando informações do pet");

	}

	@Quando("eu inserir os dados que desejo atualizar {int} , {int}, {string}, {string}, {string}, {int}, {string}, {string}")
	public void euInserirOsDadosQueDesejoAtualizar(Integer petId, Integer categoryId, String categoryName, String name,
			String photoUrls, Integer tagId, String tagName, String status) {
		System.out.println("Inserindo os dados de atualização");
		body = petBuilder.updatePet(petId, categoryId, categoryName, name, photoUrls, tagId, tagName, status);

	}

	@Quando("clicar em done")
	public void clicarEmDone() throws IOException{
		System.out.println("Clicando em done");
		petAction.updatePet(body);

	}

	@Então("terei as informações do pet atualizadas com sucesso")
	public void tereiAsInformaçõesDoPetAtualizadasComSucesso() {
		System.out.println("Informações atualizadas com sucesso");

	}
}
