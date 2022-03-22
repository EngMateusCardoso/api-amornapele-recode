package com.amornapele.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amornapele.domain.CadastroNewsletter;
import com.amornapele.repositories.CadastroNewsletterRepository;

@Service
public class CadastroNewsletterService {

	@Autowired
	private CadastroNewsletterRepository repository;
	
	public CadastroNewsletter save(CadastroNewsletter obj) {
		return repository.save(obj);
	}
	
}
