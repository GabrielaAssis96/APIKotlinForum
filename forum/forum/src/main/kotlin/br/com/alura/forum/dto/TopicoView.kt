package br.com.alura.forum.dto

import br.com.alura.forum.model.StatusTopico
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component
import java.time.LocalDateTime
import javax.validation.constraints.NotEmpty

data class TopicoView(
    val id: Long?,
    val titulo: String,
    @field:NotEmpty
    val mensagem: String,
    val status: StatusTopico,
    val dataCriacao: LocalDateTime
)
