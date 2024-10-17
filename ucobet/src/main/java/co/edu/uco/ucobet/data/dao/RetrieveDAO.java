package co.edu.uco.ucobet.data.dao;

import java.util.List;

import co.edu.uco.ucobet.entity.StateEntity;


interface RetrieveDAO<T,I>{
	
		T findByID(I id);
		
		List <T> findAll();
		
		List<T> findByFilter(T filter);

		//List<StateEntity> finAll();
	}


