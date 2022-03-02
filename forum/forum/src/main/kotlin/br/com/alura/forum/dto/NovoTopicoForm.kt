package br.com.alura.forum.dto

class NovoTopicoForm(
    var titulo: String,
    var mensagem: String,
    var idCurso: Long,
    var idAutor: Long
)