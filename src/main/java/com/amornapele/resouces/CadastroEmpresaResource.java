package com.amornapele.resouces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amornapele.domain.CadastroEmpresa;
import com.amornapele.services.CadastroEmpresaService;

@RestController
@RequestMapping("/CadastroEmpresa")
@CrossOrigin("*")
public class CadastroEmpresaResource {
	
	@Autowired
	private CadastroEmpresaService service;
	
	@PostMapping
	public CadastroEmpresa save(@RequestBody CadastroEmpresa obj) {
		return service.save(obj);
	}

}
