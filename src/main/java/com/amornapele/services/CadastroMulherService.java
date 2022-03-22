package com.amornapele.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amornapele.domain.CadastroMulher;
import com.amornapele.repositories.CadastroMulherRepository;

@Service
public class CadastroMulherService {

	@Autowired
	private CadastroMulherRepository repository;
	
	public CadastroMulher save(CadastroMulher obj) {
		return repository.save(obj);
	}
}
