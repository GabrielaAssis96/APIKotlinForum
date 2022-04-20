package br.com.alura.forum.dto

import br.com.alura.forum.model.Curso
import br.com.alura.forum.model.Topico
import br.com.alura.forum.model.Usuario

data class RespostaView(
    val curso: Curso,
    val autor: Usuario,
    val topico: Topico
)