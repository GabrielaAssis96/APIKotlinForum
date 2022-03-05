package br.com.alura.forum.dto

import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

data class AtualizarTopicoForm(
    @field:NotNull
    val id: Long,
    @field:NotEmpty
    val titulo: String,
    @field:NotEmpty
    val mensagem: String
)
