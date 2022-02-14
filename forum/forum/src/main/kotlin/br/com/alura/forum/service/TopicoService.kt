package br.com.alura.forum.service

import br.com.alura.forum.model.Curso
import br.com.alura.forum.model.Topico
import br.com.alura.forum.model.Usuario
import org.springframework.stereotype.Service
import java.util.*

@Service
class TopicoService(private var topicos: List<Topico>) {

    init {
        val topico = Topico(
            id = 1,
            titulo = "Duvida Rest",
            mensagem = "Duvida sobre Kotlin",
            curso = Curso(
                id = 2,
                nome = "Kotlin Rest",
                "Programação"
            ),
            autor = Usuario(
                id = 1,
                nome = "Maria da Silva",
                email = "maria@mail.com"
            )
        )
        val topico2 = Topico(
            id = 2,
            titulo = "Duvida Rest 2",
            mensagem = "Duvida sobre Kotlin 2 ",
            curso = Curso(
                id = 2,
                nome = "Kotlin Rest 2",
                "Programação 2"
            ),
            autor = Usuario(
                id = 1,
                nome = "Maria da Silva 2",
                email = "maria@mail.com 2"
            )
        )
        val topico3 = Topico(
            id = 3,
            titulo = "Duvida Rest 3",
            mensagem = "Duvida sobre Kotlin 3",
            curso = Curso(
                id = 2,
                nome = "Kotlin Rest 3",
                "Programação 3"
            ),
            autor = Usuario(
                id = 1,
                nome = "Maria da Silva 3",
                email = "maria@mail.com 3"
            )
        )
        topicos = Arrays.asList(topico, topico2, topico3)
    }

    fun listar(): List<Topico> {
        return topicos
    }

    fun buscarPorId(id: Long): Topico {
        return topicos.stream().filter { t ->
            t.id == id
        }.findFirst().get()
    }

}
