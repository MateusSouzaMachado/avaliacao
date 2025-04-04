package com.senai.avaliacao.repositories;

import com.senai.avaliacao.models.Movimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimentoRepository extends JpaRepository<Movimento, Long> {
}
