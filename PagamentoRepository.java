package br.com.etechas.Pagamento.repository;
import br.com.etechas.Pagamento.entity.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long>{
}
