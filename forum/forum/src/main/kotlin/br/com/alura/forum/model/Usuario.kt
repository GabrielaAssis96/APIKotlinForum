package br.com.alura.forum.model

import javax.validation.constraints.Email

data class Usuario(
    val id: Long? = null,
    val nome: String,
    val email: String
)


