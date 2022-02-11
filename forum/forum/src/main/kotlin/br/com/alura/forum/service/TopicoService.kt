package br.com.alura.forum.service

import br.com.alura.forum.model.Curso
import br.com.alura.forum.model.Topico
import br.com.alura.forum.model.Usuario
import org.springframework.stereotype.Service
import java.util.*

@Service
class TopicoService {

    fun listar(): List<Topico>{
        val topico = Topico(
            id = 1,
            titulo = "Duvida Rest",
            mensagem = "Duvida sobre Kotlin",
            curso = Curso(
                id=2,
                nome = "Kotlin Rest",
                "Programação"
            ),
            autor = Usuario(
                id = 1,
                nome = "Maria da Silva",
                email = "maria@mail.com"
            )
        )
        return Arrays.asList(topico,topico,topico)
    }

}
