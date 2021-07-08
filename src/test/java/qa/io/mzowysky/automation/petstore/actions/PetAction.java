package qa.io.mzowysky.automation.petstore.actions;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import groovyjarjarantlr4.v4.runtime.atn.SemanticContext.AND;
import io.restassured.RestAssured;
import io.restassured.config.EncoderConfig;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import qa.io.mzowysky.automation.petstore.config.EnvConfig;

@Component
public class PetAction {
	
	private ValidatableResponse request;
	private final String path = "pet/";
	private final String pathStatus = "pet/findByStatus";
	private final String pathImage = "pet/uploadImage";
	

	@Autowired
	EnvConfig envConfig;

	public ValidatableResponse createPet(String body) throws IOException { //
		envConfig.init();

		request = RestAssured.given().contentType(envConfig.getContentType()).and().accept(envConfig.getAccept()).and()
				.body(body).and().baseUri(envConfig.getBaseurl()).when().post(path).then().statusCode(200);
		return request;
	}

	public ValidatableResponse updateDataPet(String body, Integer petId) throws IOException {
		envConfig.init();

		request = RestAssured.given().contentType("application/x-www-form-urlencoded").and()
				.accept(envConfig.getAccept()).and().body(body).and().baseUri(envConfig.getBaseurl()).when()
				.post(path + petId).then().statusCode(200);

		return request;
	}

	public ValidatableResponse imagePet(String body, Integer petId) throws IOException {
		envConfig.init();

		request = RestAssured.given().config(RestAssured.config().encoderConfig(EncoderConfig.encoderConfig().encodeContentTypeAs("multipart/form-data", ContentType.TEXT)))
				.and().contentType("multipart/form-data; boundary=--MyBoundary").and().accept(envConfig.getAccept()).and().
				multiPart("file",new File(body)).and().baseUri(envConfig.getBaseurl()).when().post(path + petId + "/uploadImage/").then().statusCode(200);
		return request;
		
	}

	public ValidatableResponse findIdPet(Integer petId) throws IOException { //
		envConfig.init();

		request = RestAssured.given().accept(envConfig.getAccept()).and().baseUri(envConfig.getBaseurl()).when()
				.get(path + petId).then().statusCode(200);

		return request;
	}

	public ValidatableResponse findStatusPet(String status) throws IOException { //
		envConfig.init();

		request = RestAssured.given().accept(envConfig.getAccept()).and().queryParam("status", status).and()
				.baseUri(envConfig.getBaseurl()).when().get(pathStatus).then().statusCode(200);

		return request;
	}

	public ValidatableResponse updatePet(String body) throws IOException { //
		envConfig.init();

		request = RestAssured.given().contentType(envConfig.getContentType()).and().accept(envConfig.getAccept()).and()
				.body(body).and().baseUri(envConfig.getBaseurl()).when().put(path).then().statusCode(200);

		return request;
	}

	public ValidatableResponse deletePet(Integer petId) throws IOException { //
		envConfig.init();

		request = RestAssured.given().accept(envConfig.getAccept()).header("api_key", envConfig.getApi_key()).and()
				.baseUri(envConfig.getBaseurl()).when().delete(path + petId ).then().statusCode(200);

		return request;
	}
	
}
