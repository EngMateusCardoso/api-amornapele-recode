package com.amornapele.resouces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amornapele.domain.CadastroMulher;
import com.amornapele.services.CadastroMulherService;

@RestController
@RequestMapping("/CadastroMulher")
@CrossOrigin(origins = "https://amornapele.netlify.app/")
public class CadastroMulherResource {
	
	@Autowired
	private CadastroMulherService service;
	
	@PostMapping
	public CadastroMulher save(@RequestBody CadastroMulher obj) {
		return service.save(obj);
	}

}
