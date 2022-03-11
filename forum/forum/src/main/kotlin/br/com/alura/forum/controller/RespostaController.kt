//package br.com.alura.forum.controller
//
//import br.com.alura.forum.model.Curso
//import br.com.alura.forum.model.Resposta
//import br.com.alura.forum.model.Topico
//import br.com.alura.forum.model.Usuario
//import br.com.alura.forum.service.RespostaService
//import org.springframework.web.bind.annotation.GetMapping
//import org.springframework.web.bind.annotation.RequestMapping
//import org.springframework.web.bind.annotation.RestController
//
//@RestController
//@RequestMapping("/respostas")
//class aRespostaController(private val service: RespostaService) {
//
//    @GetMapping
//    fun listar(): List<Resposta> {
//    return service.listar()
//    }
//}