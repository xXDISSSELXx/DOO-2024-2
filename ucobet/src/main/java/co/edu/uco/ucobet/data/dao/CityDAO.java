package co.edu.uco.ucobet.data.dao;

import java.util.List;
import java.util.UUID;

import co.edu.uco.ucobet.entity.CityEntity;

 public interface CityDAO 
		extends CreateDAO<CityEntity>, RetrieveDAO<CityEntity, UUID> , DeleteDAO<UUID> , UpdateDAO<CityEntity> {
	
	 List<CityEntity>findAll();

}
