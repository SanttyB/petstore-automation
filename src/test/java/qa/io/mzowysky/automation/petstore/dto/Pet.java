package qa.io.mzowysky.automation.petstore.dto;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Pet {
	private int id;
	private Category category;
	private List<Tags> tags;
	private List<String> photoUrls;
	private String status;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public List<Tags> getTags() {
		return tags;
	}
	public void setTags(List<Tags> tags) {
		this.tags = tags;
	}
	public List<String> getPhotoUrls() {
		return photoUrls;
	}
	public void setPhotoUrls(List<String> photoUrls) {
		this.photoUrls = photoUrls;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
