package co.edu.uco.ucobet.businesslogic.adapter;

import co.edu.uco.ucobet.domain.CityDomain;
import co.edu.uco.ucobet.entity.CityEntity;

public interface Adapter<D,T> {
	D adaptSource(T data);
	
	T adaptTarget (D data);

	CityEntity adaptSource(CityDomain data);

}
