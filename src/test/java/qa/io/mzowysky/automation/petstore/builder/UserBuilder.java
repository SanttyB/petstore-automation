package qa.io.mzowysky.automation.petstore.builder;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.cucumber.messages.internal.com.google.gson.Gson;
import qa.io.mzowysky.automation.petstore.dto.User;

@Component
public class UserBuilder {
	@Autowired
	User user;
	
	
	private String jsonProviderBody;

	public String createUsers(String username, String firstName, String lastName, String email, String password, String phone) {
	
		user.setUsername(username);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setEmail(email);
		user.setPassword(password);
		user.setPhone(phone);
		return jsonParse(user);
	}
	public String updateUsers(int id,String username, String firstName, String lastName, String email, String password, String phone, int userStatus) {
		user.setId(id);
		user.setUsername(username);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setEmail(email);
		user.setPassword(password);
		user.setPhone(phone);
		user.setUserStatus(userStatus);
		return jsonParse(user);
	}
	
	public String listUsers(String username, String firstName, String lastName, String email, String password, String phone) {
		List<User> userLista= new ArrayList<User>();
		user.setUsername(username);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setEmail(email);
		user.setPassword(password);
		user.setPhone(phone);
		userLista.add(user);
		return jsonParse(userLista);
	}

	// Metodo parse Object for Json
	public String jsonParse(Object object) {
		Gson gson = new Gson();
		this.jsonProviderBody = gson.toJson(object);
		return jsonProviderBody;
	}

	}

