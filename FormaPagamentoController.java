package br.com.etechas.Pagamento.controller;
import br.com.etechas.Pagamento.entity.FormaPagamento;
import br.com.etechas.Pagamento.repository.FormaPagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/formas-pagamento")
public class FormaPagamentoController {
    private final FormaPagamentoRepository formaPagamentoRepository;

    public FormaPagamentoController(FormaPagamentoRepository formaPagamentoRepository){
        this.formaPagamentoRepository = formaPagamentoRepository;
    }

    @GetMapping
    public List<FormaPagamento> listar(){
        return formaPagamentoRepository.findAll();
    }

    @GetMpping("/{id}")
    public FormaPagamento buscarPorId(@PathVariable Long id){
        return formaPagamentoRepository.findById(id).orElse(null);
    }

    @PostMapping
    public FormaPagamento criar(@RequestBody FormaPagamento formaPagamento){
        return  formaPagamentoRepository.save(formaPagamento);
    }

    @PutMapping("/{id")
    public FormaPagamento atualizar(@PathVariable Long id, @RequestBody FormaPagamento formaPagamento){
        FormaPagamento existente = formaPagamentoRepository.findById(id).orElse(null);
        if(existente == null) return null;
        return formaPagamentoRepository.save(existente);
    }

    @DeleteMapping("/{id}")
    purblic void deletar(@PathVariable Long id){
        formaPagamentoRepository.deleteById(id);
    }
}
