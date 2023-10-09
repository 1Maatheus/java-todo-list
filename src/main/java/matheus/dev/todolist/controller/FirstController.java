package matheus.dev.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/firstRoute")
public class FirstController {

  /**
   * Métodos de acesso HTTP
   * GET - Buscar informação
   * POST - Adicionar um dado/informação
   * PUT - Alterar um dado/informação
   * DELETE - Remover um dado
   * PATCH - Alterar somente uma parte da info/dado
   * 
   */
  
  @GetMapping("/")
  public String firstMessage() {
    return "Hello, World!";
  }
}
