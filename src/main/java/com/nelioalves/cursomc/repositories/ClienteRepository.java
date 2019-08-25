package com.nelioalves.cursomc.repositories;

import com.nelioalves.cursomc.domain.Cliente;
import com.nelioalves.cursomc.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

    Cliente findByEmail(String email);

}
