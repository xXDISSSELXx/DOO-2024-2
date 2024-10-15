package co.edu.uco.ucobet.dto;

import java.util.UUID;

import co.edu.uco.crosscutting.helpers.TextHelper;
import co.edu.uco.crosscutting.helpers.UUIDHelper;

class DomainDTO {
	
	private String id;
	
	protected DomainDTO(final String id){
		setId(id);
		
	}

	private void setId(String id) {
		// TODO Auto-generated method stub
		
	}

	protected String getId() {
		return id;
	}

	

	protected void setIdentifier(final String id) {
		this.id = TextHelper.getDefault(id,UUIDHelper.getDefaultAsString());
		
	}

}
