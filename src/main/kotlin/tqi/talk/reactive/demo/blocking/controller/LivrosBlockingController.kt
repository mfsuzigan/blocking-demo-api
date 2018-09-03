package tqi.talk.reactive.demo.blocking.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import tqi.talk.reactive.demo.blocking.model.Compra
import tqi.talk.reactive.demo.blocking.model.Livro
import tqi.talk.reactive.demo.blocking.model.Login
import tqi.talk.reactive.demo.blocking.service.LivrariaService

@RestController
@RequestMapping("livraria")
class LivrosBlockingController(private val service: LivrariaService) {

    @PostMapping("/login")
    fun login(): Login {
       return service.login()
    }

    @GetMapping("/livros")
    fun recuperarLivros(): List<Livro> {
        return service.recuperarLivros()
    }

    @PostMapping("/compras/livros/{id}")
    fun comprar(): Compra {
        return service.comprar()
    }

}