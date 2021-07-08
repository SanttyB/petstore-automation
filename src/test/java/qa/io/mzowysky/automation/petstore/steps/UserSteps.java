package qa.io.mzowysky.automation.petstore.steps;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import qa.io.mzowysky.automation.petstore.actions.UserAction;
import qa.io.mzowysky.automation.petstore.builder.UserBuilder;

public class UserSteps {
	@Autowired
	UserBuilder userBuilder;
	
	@Autowired
	UserAction userAction;
	
	
	private String body;
	
	private String username;
	private String password;
	
	
	
	// Criar Usuário * 
	@Dado("que eu esteja na home e desejo criar um usuário")
	public void queEuEstejaNaHomeEDesejoCriarUmUsuário() {
		System.out.println("Estou na home criando um usuário");
		
	}

	@Quando("eu preencher os dados cadastrais necessários corretamente {string}, {string},{string},{string},{string},{string}")
	public void euPreencherOsDadosCadastraisNecessáriosCorretamente(String username, String firstName, String lastName, String email, 
			String password, String phone) {
		System.out.println("preenchendo os dados cadastrais");
		body = userBuilder.createUsers(username, firstName, lastName, email, password, phone);
		
	}

	@Quando("clicar em send")
	public void clicarEmSend() throws IOException {
		System.out.println("clicando em send");
		userAction.createUser(body);
	}

	@Então("terei meu usuário cadastrado com sucesso")
	public void tereiMeuUsuárioCadastradoComSucesso() {
		System.out.println("Usuário cadastrado com sucesso");
	}
	
	// Criar Usuário com Array
	
	@Dado("que eu queira criar uma lista de usuários")
	public void queEuQueiraCriarUmaListaDeUsuários() {
		System.out.println("Criando uma lista de usuários");
	    
	}
	@Quando("eu preencher os dados dos usuarios corretamente  {string},{string},{string},{string},{string}")
	public void euPreencherOsDadosDosUsuariosCorretamente(String firstName, String lastName, String email, String password, String phone) {
		System.out.println("preenchendo os dados dos usuários");
		body = userBuilder.listUsers(username, firstName, lastName, email, password, phone);
	}
	@Quando("clicar na celula send")
	public void clicarNaCelulaSend() throws IOException{
		System.out.println("Clicando em send");
		userAction.ListUser(body);
	    
	}
	@Então("terei minha lista de usuários criada com sucesso")
	public void tereiMinhaListaDeUsuáriosCriadaComSucesso() {
		System.out.println("Lista de usuários criada com sucesso");
	}
	
	//Buscar Usuário
	
	@Dado("que eu esteja na home")
	public void queEuEstejaNaHome() {
		System.out.println("Estou na home criando um usuário");
	}
	@Dado("queira buscar os dados de um usuário")
	public void queiraBuscarOsDadosDeUmUsuário() {
		System.out.println("Quero buscar os dados do usuário");
	}
	@Quando("eu inserir o nome do usuário {string}")
	public void euInserirONomeDoUsuário(String username) {
		System.out.println("Inserindo o nome do usuário");
		this.username = username;
	}
	@Quando("clicar no botão send")
	public void clicarNoBotãoSend() throws IOException {
		System.out.println("Clicando no botão send");
		userAction.findUser(username);
	    
	}
	@Então("terei o retorno dos dados cadastrados do usuário")
	public void tereiORetornoDosDadosCadastradosDoUsuário() {
		System.out.println("Dados de cadastro do usuário retornado com sucesso");
	}

	//Efetuar Login 
	
	@Dado("que eu esteja na home e queria efetuar login no sistema")
	public void queEuEstejaNaHomeEQueriaEfetuarLoginNoSistema() {
		System.out.println("Estou na home efetuando login");
	}
	@Quando("eu inserir o usuário e a senha {string}, {string}")
	public void euInserirOUsuárioEASenha(String username, String password) {
		System.out.println("Inserindo o usuário e a senha");
		this.username = username;
		this.password = password;
	}
	@Quando("clicar no botão enviar")
	public void clicarNoBotãoEnviar() throws IOException{
		System.out.println("Clicando em enviar");
		userAction.loginUser(username,password);
		
	}
	@Então("terei meu login efetuado com sucesso")
	public void tereiMeuLoginEfetuadoComSucesso() {
		System.out.println("Login efetuado com sucesso");
	}

	//Efetuar Logout
	
	@Dado("que eu esteja logado no sistema")
	public void queEuEstejaLogadoNoSistema() {
		System.out.println("Estou logado no sistema");
	}
	@Dado("queira efetuar logout do mesmo")
	public void queiraEfetuarLogoutDoMesmo() {
		System.out.println("Quero efetuar logout do sistema");
	}
	@Quando("eu clicar no botão de logout")
	public void euClicarNoBotãoDeLogout() throws IOException {
		System.out.println("Clicando no botão logout");
		userAction.logoutUser();
	}
	@Então("serei deslogado do sistema")
	public void sereiDeslogadoDoSistema() {
		System.out.println("Logout efetuado com sucesso");
	}
	
	//Deletar Usuário
	
	@Dado("que eu esteja logado na home")
	public void queEuEstejaLogadoNaHome() {
		System.out.println("Estou na home");
	}
	@Dado("queira deletar um usuário")
	public void queiraDeletarUmUsuário() {
		System.out.println("Quero deletar um usuário");
	}
	@Quando("eu inserir o nome do usuário no campo de exclusão {string}")
	public void euInserirONomeDoUsuárioNoCampoDeExclusão(String username) throws IOException{
		System.out.println("Inserindo nome do usuário no campo");
		this.username = username;
	
	}
	@Quando("clicar no botão execute")
	public void clicarNoBotãoExecute() throws IOException {
		System.out.println("Clicando em execute");
		userAction.deleteUser(username);
	}
	@Então("o usuário será deletado com sucesso")
	public void oUsuárioSeráDeletadoComSucesso() {
		System.out.println("Usuário deletado com sucesso");
	}

	//Atualizar Usuário
	
	@Dado("que eu queira alterar os dados de algum usuário")
	public void queEuQueiraAlterarOsDadosDeAlgumUsuário() {
		System.out.println("Quero alterar os dados do usuário");
	}
	@Quando("eu inserir o nome do usuário no primeiro campo {string}")
	public void euInserirONomeDoUsuárioNoPrimeiroCampo(String username) {
		System.out.println("Inserindo o nome do usuario");
		this.username = username;
		
	}
	@Quando("clicar em execute")
	public void clicarEmBotãoExecute() throws IOException {
		System.out.println("Clicando no botão execute");
		
	}
	@Quando("inserir os dados que desejo atualizar  {int} , {string},{string},{string},{string},{string},{string}, {int}")
	public void inserirOsDadosQueDesejoAtualizar(Integer id, String username, String firstName, String lastName, String email, String password, String phone, Integer userStatus)  {
		System.out.println("Inserindo os dados que irei atualizar");
		body = userBuilder.updateUsers(id, username , firstName, lastName, email, password, phone, userStatus);
	}
	@Quando("clicar no botão salvar")
	public void clicarNoBotãoSalvar() throws IOException {
		System.out.println("Clicando em salvar");
		userAction.updateUser(body, username);
	}
	@Então("terei os dados do meu usuário atualizado")
	public void tereiOsDadosDoMeuUsuárioAtualizado() {
		System.out.println("Usuário atualizado com sucesso");
	}
	
}
