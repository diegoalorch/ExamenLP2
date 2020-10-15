package pe.edu.upeu.lp2exa1DiegoAlor.examen.serviceimp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.lp2exa1DiegoAlor.examen.dao.Detalle_pedidoDao;
import pe.edu.upeu.lp2exa1DiegoAlor.examen.entity.Detalle_pedido;
import pe.edu.upeu.lp2exa1DiegoAlor.examen.service.Detalle_pedidoService;
@Service
public class Detalle_ventasImp implements Detalle_pedidoService {
	@Autowired
	private Detalle_pedidoDao detalle_ventasDao;  

	@Override
	public Detalle_pedido read(int id) {
		// TODO Auto-generated method stub
		return detalle_ventasDao.read(id);
	}


}
