package br.com.alura.forum.dto

import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

data class NovoTopicoForm(
    @field:NotEmpty
    var titulo: String,
    @field:NotEmpty
    var mensagem: String,
    @field:NotNull
    var idCurso: Long,
    @field:NotNull
    var idAutor: Long
)