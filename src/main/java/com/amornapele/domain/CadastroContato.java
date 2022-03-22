package com.amornapele.domain;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CadastroContato {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID_Contato;
	private String nomeContato;
	private String msg;
	private String emailContato;
	
	public CadastroContato() {
	}
		
	public CadastroContato(Long iD_Contato, String nomeContato, String msg, String emailContato) {
		super();
		ID_Contato = iD_Contato;
		this.nomeContato = nomeContato;
		this.msg = msg;
		this.emailContato = emailContato;
	}

	public Long getID_Contato() {
		return ID_Contato;
	}

	public void setID_Contato(Long iD_Contato) {
		ID_Contato = iD_Contato;
	}

	public String getNomeContato() {
		return nomeContato;
	}

	public void setNomeContato(String nomeContato) {
		this.nomeContato = nomeContato;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getEmailContato() {
		return emailContato;
	}

	public void setEmailContato(String emailContato) {
		this.emailContato = emailContato;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ID_Contato);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CadastroContato other = (CadastroContato) obj;
		return Objects.equals(ID_Contato, other.ID_Contato);
	}

	
}
