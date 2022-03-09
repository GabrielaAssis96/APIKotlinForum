package br.com.alura.forum.dto

import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

data class NovoTopicoForm(
    @field:NotEmpty(message = "Campo titulo não poderá ser vazio")
    var titulo: String,
    @field:NotEmpty(message = "Campo mensagem não poderá ser vazia")
    var mensagem: String,
    @field:NotNull
    var idCurso: Long,
    @field:NotNull
    var idAutor: Long
)