package br.com.caelum.tarefas.controller;

@Controller
public class OlaMundoController {
	@RequestMapping("/olaMundoSpring")
	  public String execute() {
	    System.out.println("Executando a l�gica com Spring MVC");
	    return "ok";
	  }

}
