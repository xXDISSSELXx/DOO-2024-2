package co.edu.uco.ucobet.businesslogic.usecase;

import co.edu.uco.ucobet.domain.CityDomain;

public interface UseWithReturn <D , R>{
	
	R execute (D data);

	

}
