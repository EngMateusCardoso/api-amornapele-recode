package com.amornapele.domain;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CadastroEmpresa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID_Empresa;
	private String nomeParaContatoEmpresa;
	private String cnpj;
	private String razaoSocial;
	private String numeroDeTelefoneEmpresa;
	private String emailEmpresa;
	private String estado;
	private String cidade;
	private String endereco;
	private String descricaoNegocio;
	
	public CadastroEmpresa() {
	}
	
	public CadastroEmpresa(Long iD_Empresa, String nomeParaContatoEmpresa, String cnpj, String razaoSocial,
			String numeroDeTelefoneEmpresa, String emailEmpresa, String estado, String cidade, String endereco,
			String descricaoNegocio) {
		super();
		ID_Empresa = iD_Empresa;
		this.nomeParaContatoEmpresa = nomeParaContatoEmpresa;
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.numeroDeTelefoneEmpresa = numeroDeTelefoneEmpresa;
		this.emailEmpresa = emailEmpresa;
		this.estado = estado;
		this.cidade = cidade;
		this.endereco = endereco;
		this.descricaoNegocio = descricaoNegocio;
	}
	
	public Long getID_Empresa() {
		return ID_Empresa;
	}
	
	public void setID_Empresa(Long iD_Empresa) {
		ID_Empresa = iD_Empresa;
	}
	
	public String getNomeParaContatoEmpresa() {
		return nomeParaContatoEmpresa;
	}
	
	public void setNomeParaContatoEmpresa(String nomeParaContatoEmpresa) {
		this.nomeParaContatoEmpresa = nomeParaContatoEmpresa;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getRazaoSocial() {
		return razaoSocial;
	}
	
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	public String getNumeroDeTelefoneEmpresa() {
		return numeroDeTelefoneEmpresa;
	}
	
	public void setNumeroDeTelefoneEmpresa(String numeroDeTelefoneEmpresa) {
		this.numeroDeTelefoneEmpresa = numeroDeTelefoneEmpresa;
	}
	
	public String getEmailEmpresa() {
		return emailEmpresa;
	}
	
	public void setEmailEmpresa(String emailEmpresa) {
		this.emailEmpresa = emailEmpresa;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getDescricaoNegocio() {
		return descricaoNegocio;
	}
	
	public void setDescricaoNegocio(String descricaoNegocio) {
		this.descricaoNegocio = descricaoNegocio;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ID_Empresa);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CadastroEmpresa other = (CadastroEmpresa) obj;
		return Objects.equals(ID_Empresa, other.ID_Empresa);
	}
	
}
