package com.amornapele.domain;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CadastroNewsletter {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID_Newsletter;
	private String emailNewsletter;
	
	public CadastroNewsletter() {
	}
	
	public CadastroNewsletter(Long iD_Newsletter, String emailNewsletter) {
		super();
		ID_Newsletter = iD_Newsletter;
		this.emailNewsletter = emailNewsletter;
	}
	
	public Long getID_Newsletter() {
		return ID_Newsletter;
	}
	
	public void setID_Newsletter(Long iD_Newsletter) {
		ID_Newsletter = iD_Newsletter;
	}
	
	public String getEmailNewsletter() {
		return emailNewsletter;
	}
	
	public void setEmailNewsletter(String emailNewsletter) {
		this.emailNewsletter = emailNewsletter;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(ID_Newsletter);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CadastroNewsletter other = (CadastroNewsletter) obj;
		return Objects.equals(ID_Newsletter, other.ID_Newsletter);
	}
	
}
