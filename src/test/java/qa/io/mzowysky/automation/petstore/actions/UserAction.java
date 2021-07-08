package qa.io.mzowysky.automation.petstore.actions;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import qa.io.mzowysky.automation.petstore.config.EnvConfig;

@Component
public class UserAction {
	private ValidatableResponse request;
	private final String path = "user/";
	private final String pathLogin = "user/login";
	private final String pathLogout = "user/logout";
	private final String pathList = "user/createWithList";




	@Autowired
	EnvConfig envConfig;

	public ValidatableResponse createUser(String body) throws IOException { //
		envConfig.init();

		request = RestAssured.given().contentType(envConfig.getContentType()).and().accept(envConfig.getAccept()).and()
				.body(body).baseUri(envConfig.getBaseurl()).when().post(path).then().statusCode(200);

		return request;
	}
	
	public ValidatableResponse ListUser(String body) throws IOException { //
		envConfig.init();

		request = RestAssured.given().contentType(envConfig.getContentType()).and().accept(envConfig.getAccept()).and()
				.body(body).baseUri(envConfig.getBaseurl()).when().post(pathList).then().statusCode(200);

		return request;
	}

	public ValidatableResponse findUser(String username) throws IOException { //
		envConfig.init();

		request = RestAssured.given().accept(envConfig.getAccept()).and().baseUri(envConfig.getBaseurl()).when()
				.get(path + username).then().statusCode(200);

		return request;
	}

	public ValidatableResponse loginUser(String username, String password) throws IOException { //
		envConfig.init();

		request = RestAssured.given().accept(envConfig.getAccept()).and().queryParam("username", username).and()
				.queryParam("password", password).and().baseUri(envConfig.getBaseurl()).when().get(pathLogin).then()
				.statusCode(200);

		return request;
	}
	
	public ValidatableResponse logoutUser() throws IOException { //
		envConfig.init();

		request = RestAssured.given().accept(envConfig.getAccept()).and().baseUri(envConfig.getBaseurl()).when()
				.get(pathLogout).then().statusCode(200);

		return request;
	}

	public ValidatableResponse deleteUser(String username) throws IOException { //
		envConfig.init();

		request = RestAssured.given().accept(envConfig.getAccept()).and().baseUri(envConfig.getBaseurl()).when()
				.delete(path + username).then().statusCode(200);

		return request;
	}

	public ValidatableResponse updateUser(String body, String username) throws IOException {
		envConfig.init();

		request = RestAssured.given().contentType(envConfig.getContentType()).and().accept(envConfig.getAccept()).and()
				.body(body).baseUri(envConfig.getBaseurl()).when().put(path + username).then().statusCode(200);

		return request;
	}
}
