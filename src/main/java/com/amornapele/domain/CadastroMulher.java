package com.amornapele.domain;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CadastroMulher {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID_Mulher;
	private String nomeMulher;
	private String dataNascimento;
	private String numeroTelefoneMulher;
	private String emailMulher;
	
	public CadastroMulher() {
	}
	
	public CadastroMulher(Long iD_Mulher, String nomeMulher, String dataNascimento, String numeroTelefoneMulher,
			String emailMulher) {
		super();
		ID_Mulher = iD_Mulher;
		this.nomeMulher = nomeMulher;
		this.dataNascimento = dataNascimento;
		this.numeroTelefoneMulher = numeroTelefoneMulher;
		this.emailMulher = emailMulher;
	}
	

	public Long getID_Mulher() {
		return ID_Mulher;
	}
	

	public void setID_Mulher(Long iD_Mulher) {
		ID_Mulher = iD_Mulher;
	}
	

	public String getNomeMulher() {
		return nomeMulher;
	}
	

	public void setNomeMulher(String nomeMulher) {
		this.nomeMulher = nomeMulher;
	}
	

	public String getDataNascimento() {
		return dataNascimento;
	}
	

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	

	public String getNumeroTelefoneMulher() {
		return numeroTelefoneMulher;
	}
	

	public void setNumeroTelefoneMulher(String numeroTelefoneMulher) {
		this.numeroTelefoneMulher = numeroTelefoneMulher;
	}
	

	public String getEmailMulher() {
		return emailMulher;
	}
	

	public void setEmailMulher(String emailMulher) {
		this.emailMulher = emailMulher;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ID_Mulher);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CadastroMulher other = (CadastroMulher) obj;
		return Objects.equals(ID_Mulher, other.ID_Mulher);
	}
	
}
