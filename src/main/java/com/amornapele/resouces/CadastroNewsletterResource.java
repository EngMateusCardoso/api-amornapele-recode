package com.amornapele.resouces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amornapele.domain.CadastroNewsletter;
import com.amornapele.services.CadastroNewsletterService;

@RestController
@RequestMapping("/CadastroNewsletter")
@CrossOrigin(origins = "https://amornapele.netlify.app/")
public class CadastroNewsletterResource {

	@Autowired
	private CadastroNewsletterService service;
	
	@PostMapping
	public CadastroNewsletter save(@RequestBody CadastroNewsletter obj) {
		return service.save(obj);
	}
	
}
