package com.nelioalves.cursomc.repositories;

import com.nelioalves.cursomc.domain.Pagamento;
import com.nelioalves.cursomc.domain.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer>{

}
