package com.amornapele.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amornapele.domain.CadastroEmpresa;

@Repository
public interface CadastroEmpresaRepository  extends JpaRepository<CadastroEmpresa, Long>{

}
