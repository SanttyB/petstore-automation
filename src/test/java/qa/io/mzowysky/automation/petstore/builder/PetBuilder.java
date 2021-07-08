package qa.io.mzowysky.automation.petstore.builder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.cucumber.messages.internal.com.google.gson.Gson;
import qa.io.mzowysky.automation.petstore.dto.Category;
import qa.io.mzowysky.automation.petstore.dto.Pet;
import qa.io.mzowysky.automation.petstore.dto.Tags;

@Component
public class PetBuilder {

	@Autowired
	Pet pet;

	@Autowired
	Category category;

	@Autowired
	Tags tags;

	private String jsonProviderBody;

	public String createPet(String name1, String name2, String photoUrls, String status, String name) {
		category.setName(name1);
		tags.setName(name2);
		List<Tags> tag = new ArrayList<Tags>();
		tag.add(tags);
		pet.setPhotoUrls(Arrays.asList(photoUrls));
		pet.setStatus(status);
		pet.setName(name);
		pet.setCategory(category);
		pet.setTags(tag);
		return jsonParse(pet);
	}

	public String updatePet(Integer id, Integer id1, String name1, String name, String photoUrls, Integer id2,
			String name2, String status) {
		category.setName(name1);
		category.setId(id1);
		tags.setName(name2);
		tags.setId(id2);
		List<Tags> tag = new ArrayList<Tags>();
		tag.add(tags);
		pet.setId(id);
		pet.setPhotoUrls(Arrays.asList(photoUrls));
		pet.setStatus(status);
		pet.setName(name);
		pet.setCategory(category);
		pet.setTags(tag);
		return jsonParse(pet);
	}

	public String image(String file) {

		String imagem = file;
		return imagem;
	}

	public String updateData(String name, String status) {

		pet.setName(name);
		pet.setStatus(status);
		return jsonParse(pet);

		
	}

	

	// Metodo parse Object for Json
	public String jsonParse(Object object) {
		Gson gson = new Gson();
		this.jsonProviderBody = gson.toJson(object);
		return jsonProviderBody;
	}

}
