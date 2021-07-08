package qa.io.mzowysky.automation.petstore.config;

import java.io.IOException;

import org.springframework.stereotype.Component;

import qa.io.mzowysky.automation.petstore.enums.EnvEnum;

@Component
public class EnvConfig {
	private static final EnvEnum environment = EnvEnum.HML;

	private String username;
	private String password;
	private String accept;
	private String contentType;
	private String baseurl;
	private String api_key;

	public void init() throws IOException {

		switch (environment) {
		case DEV:

			this.accept = "application/json";
			this.contentType = "application/json";
			this.password = "";
			this.username = "";
			this.baseurl = "https://petstore.swagger.io/v2";
			this.api_key = "JUOGHJ";

			break;

		case HML:

			this.accept = "application/json";
			this.contentType = "application/json";
			this.password = "";
			this.username = "";
			this.baseurl = "https://petstore.swagger.io/v2";
			this.api_key = "JUOGHJ";
			
			break;

		case PROD:

			this.accept = "application/json";
			this.contentType = "application/json";
			this.password = "";
			this.username = "";
			this.baseurl = "https://petstore.swagger.io/v2";
			this.api_key = "JUOGHJ";
			
			break;
		}
	}

	public static EnvEnum getEnvironment() {
		return environment;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getAccept() {
		return accept;
	}

	public String getContentType() {
		return contentType;
	}

	public String getBaseurl() {
		return baseurl;
	}

	public String getApi_key() {
		return api_key;
	}
	
}
