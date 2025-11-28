package br.com.etechas.Pagamento.controller;
import br.com.etechas.Pagamento.entity.Pagamento;
import br.com.etechas.Pagamento.repository.PagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestCOntroller
@RequestMapping("/pagamentos")
public class PagamentoController {

    private final PagamentoRepository pagamentoRepository;

    public PagamentoController(PagamentoRepository pagamentoRepository){
        this.pagamentoRepository = pagamentoRepository;
    }

    @GetMapping
    public List<Pagamento> listar(){
        return pagamentoRepository.findAll();
    }

    @GetMapping("/{id")
    public Pagamento buscarPorId(@PathVariable Long id){
        return pagamentoRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Pagamento criar(@RequestBody Oagamento pagamento){
        return pagamentoRepository.save(pagamento);
    }

    @PutMapping("/{id}")
    public Pagamento atualizar(@PathVariable Long id, @RequestBody Pagamento pagamento){
        Pagamento existente = pagamentoRepository.findById(id).orElse(null);
        if(existente == null) return null;
        return pagamentoRepository.save(existente);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable LOng id){
        pagamentoRepository.deleteById(id);
    }
}
