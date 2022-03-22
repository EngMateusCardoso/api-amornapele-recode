package com.amornapele.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amornapele.domain.CadastroNewsletter;

@Repository
public interface CadastroNewsletterRepository extends JpaRepository<CadastroNewsletter, Long>{

}
