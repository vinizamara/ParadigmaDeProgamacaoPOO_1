package dc.unifacef.memoria.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController //controlador de requisição REST
@RequestMapping("/produto") // mapeamento de requisição
public class ProdutoController {
    @GetMapping
    public String mensagem(){
        return "Hello World!";
    }
}
