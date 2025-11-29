package com.devsuperior.bds04.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.bds04.dto.CityDTO;
import com.devsuperior.bds04.entities.City;
import com.devsuperior.bds04.repositories.CityRepository;

@Service
public class CityService {
	
	private final CityRepository repository;

	public CityService(CityRepository repository) {
		this.repository = repository;
	}
	
	@Transactional(readOnly = true)
	public Page<CityDTO> findAll(Pageable pageable){
		Page<City> page = repository.findAll(pageable);
		return page.map(CityDTO::new);
	}
	
	@Transactional
	public CityDTO insert(CityDTO dto) {
		City entity = new City();
		entity.setName(dto.getName());		
		entity = repository.save(entity);
		return new CityDTO(entity);
	}
}
