package com.amornapele.resouces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amornapele.domain.CadastroContato;
import com.amornapele.services.CadastroContatoService;

@RestController
@RequestMapping("/CadastroContato")
public class CadastroContatoResource {

	@Autowired
	private CadastroContatoService service;
	
	@PostMapping
	public CadastroContato save(@RequestBody CadastroContato obj) {
		return service.save(obj);
	}
}
