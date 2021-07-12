package qa.io.mzowysky.automation.petstore.dto;

import org.springframework.stereotype.Component;

@Component
public class Store {
	
	 private int id;
		private int petId;
		private int quantity;
		private String shipDate;
		private String status;
		private boolean complete;
		
		public boolean isComplete() {
			return complete;
		}
		public void setComplete(boolean complete) {
			this.complete = complete;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getPetId() {
			return petId;
		}
		public void setPetId(int petId) {
			this.petId = petId;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public String getShipDate() {
			return shipDate;
		}
		public void setShipDate(String shipDate) {
			this.shipDate = shipDate;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		
	}