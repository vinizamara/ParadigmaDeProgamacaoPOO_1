package controller;

import dc.unifacef.bd.model.Produto;
import dc.unifacef.bd.service.ProdutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // Ele recebe requisições HTTP
@RequestMapping("/produtos")
public class ProdutoController {
    // Vamos usar um objeto da classe Produto Service - injeção de dependência
    // Vamos usar o construtor para isso
    private ProdutoService service;
    public ProdutoController(ProdutoService service){
        this.service = service;
    }

    // por que usar o ResponseEntity? Para retornar diferentes status code ao Front end
    @GetMapping
    public ResponseEntity<List<Produto>> listar(){
        return ResponseEntity.ok(service.listar()); // statusCode: 200
    }
}
