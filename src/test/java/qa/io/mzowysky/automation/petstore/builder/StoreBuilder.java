package qa.io.mzowysky.automation.petstore.builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import io.cucumber.messages.internal.com.google.gson.Gson;
import qa.io.mzowysky.automation.petstore.dto.Store;

@Component
public class StoreBuilder {
	@Autowired
	Store store;

	private String jsonProviderBody;


	public String orderPetStore(Integer id, Integer petId, Integer quantity, String shipDate, String status, boolean complete) {

	store.setId(id);
	store.setPetId(petId);
	store.setQuantify(quantity);
	store.setShipDate(shipDate);
	store.setStatus(status);
	store.setComplete(complete);

	return jsonParse(store);
	}

	// Metodo parse Object for Json
	public String jsonParse(Object object) {
	Gson gson = new Gson();
	this.jsonProviderBody = gson.toJson(object);
	return jsonProviderBody;
	}



}
