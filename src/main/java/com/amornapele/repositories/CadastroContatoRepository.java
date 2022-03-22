package com.amornapele.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amornapele.domain.CadastroContato;

@Repository
public interface CadastroContatoRepository extends JpaRepository<CadastroContato, Long>{

}
