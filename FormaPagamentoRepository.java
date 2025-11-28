package br.com.etechas.Pagamento.repository;
import br.com.etechas.Pagamento.entity.FormaPagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormaPagamentoRepository extends JpaRepository<FormaPagamento, Long> {
}
