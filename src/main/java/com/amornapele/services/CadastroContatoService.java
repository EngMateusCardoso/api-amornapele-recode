package com.amornapele.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amornapele.domain.CadastroContato;
import com.amornapele.repositories.CadastroContatoRepository;

@Service
public class CadastroContatoService {

	@Autowired
	private CadastroContatoRepository repository;
	
	public CadastroContato save(CadastroContato obj) {
		return repository.save(obj);
	}
}
