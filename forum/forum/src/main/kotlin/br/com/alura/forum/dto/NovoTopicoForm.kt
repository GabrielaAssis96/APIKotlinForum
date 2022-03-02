package br.com.alura.forum.dto

import javax.validation.constraints.NotEmpty
import javax.validation.constraints.Size

class NovoTopicoForm(
    @field:NotEmpty
    @field:Size(min = 5, max = 100)
    var titulo: String,
    @field:NotEmpty
    var mensagem: String,
    @field:NotEmpty
    var idCurso: Long,
    @field:NotEmpty
    var idAutor: Long
)