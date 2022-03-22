package com.amornapele.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amornapele.domain.CadastroEmpresa;
import com.amornapele.repositories.CadastroEmpresaRepository;

@Service
public class CadastroEmpresaService {

	@Autowired
	private CadastroEmpresaRepository repository;
	
	public CadastroEmpresa save(CadastroEmpresa obj) {
		return repository.save(obj);
	}
}
