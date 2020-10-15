package pe.edu.upeu.lp2exa1DiegoAlor.examen.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.lp2exa1DiegoAlor.examen.entity.Detalle_pedido;
import pe.edu.upeu.lp2exa1DiegoAlor.examen.service.Detalle_pedidoService;


@RestController
	@RequestMapping("/detalle_pedidos")
public class Detalle_pedidoController {
	@Autowired
	private Detalle_pedidoService detalle_pedidoService;

@GetMapping("/{id}")
public Detalle_pedido read (@PathVariable int id) {
	return detalle_pedidoService.read(id);
	
}

}
