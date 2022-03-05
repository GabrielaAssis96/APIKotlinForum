package br.com.alura.forum.model

import br.com.alura.forum.dto.TopicoView
import br.com.alura.forum.service.TopicoService
import java.time.LocalDateTime

data class Resposta(
    var id: Long? = null,
    val mensagem: String,
    val dataCriacao: LocalDateTime = LocalDateTime.now(),
    val autor: Long,
    var topico: Topico,
    val solucao: Boolean
)
