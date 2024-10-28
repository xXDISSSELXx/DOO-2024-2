package co.edu.uco.ucobet.businesslogic.usecase.city;

import java.util.List;

import co.edu.uco.ucobet.businesslogic.usecase.UseWithReturn;
import co.edu.uco.ucobet.domain.CityDomain;

public interface FindCity<R> extends UseWithReturn<CityDomain, List<CityDomain>> {

}
