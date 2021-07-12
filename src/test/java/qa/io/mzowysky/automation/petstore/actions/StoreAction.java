package qa.io.mzowysky.automation.petstore.actions;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import qa.io.mzowysky.automation.petstore.config.EnvConfig;

@Component
public class StoreAction {
	private ValidatableResponse request;
	private final String path = "store/";
	private final String path2 = "store/order/";


	@Autowired
	private EnvConfig envConfig;

	public ValidatableResponse inventoryStore() throws IOException { //
		envConfig.init();

		request = RestAssured.given().accept(envConfig.getAccept()).and().baseUri(envConfig.getBaseurl()).when()
				.get(path + "inventory").then().statusCode(200);

		return request;
	}

	public ValidatableResponse orderStore(String body) throws IOException { //
		envConfig.init();

		request = RestAssured.given().contentType(envConfig.getContentType()).accept(envConfig.getAccept()).and()
				.body(body).baseUri(envConfig.getBaseurl()).when().post(path + "order").then().statusCode(200);

		return request;
	}

	public ValidatableResponse findStore(Integer petId) throws IOException { //
		envConfig.init();

		request = RestAssured.given().accept(envConfig.getAccept()).and().baseUri(envConfig.getBaseurl()).when()
				.get(path2 + petId).then().statusCode(200);

		return request;
	}

	public ValidatableResponse deleteStore(Integer id) throws IOException {
		envConfig.init();

		request = RestAssured.given().accept(envConfig.getAccept()).and().baseUri(envConfig.getBaseurl()).when()
				.delete(path2 + id).then().statusCode(200);

		return request;
	}
}
