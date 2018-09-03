package tqi.talk.reactive.demo.blocking.service

import org.springframework.stereotype.Component
import tqi.talk.reactive.demo.blocking.model.Compra
import tqi.talk.reactive.demo.blocking.model.Livro
import tqi.talk.reactive.demo.blocking.model.Login
import tqi.talk.reactive.demo.blocking.model.Usuario

@Component
class LivrariaService {

    fun login(): Login {
        esperar(1000)
        return Login(Usuario.exemplo())
    }

    fun recuperarUsuario(): Usuario {
        esperar(200)
        return Usuario.exemplo()
    }

    fun recuperarLivro():Livro {
        esperar(200)
        return Livro.exemplo()
    }

    fun recuperarLivros():List<Livro> {
        esperar(200)
        return Livro.exemplos()
    }

    fun comprar(): Compra {
        val usuario = recuperarUsuario()
        val livro = recuperarLivro()

        esperar(1000)

        return Compra.exemplo(usuario, livro)
    }


//    private fun esperar(milissegundos: Long): Mono<Long> {
//        return Mono.just(System.out.println("Esperando $milissegundos milissegundos"))
//                .then(Mono.delay(Duration.ofMillis(milissegundos)))
//    }

    private fun esperar(milissegundos: Long) = Thread.sleep(milissegundos)
}