package pe.edu.upeu.lp2exa1DiegoAlor.examen.daoimp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.lp2exa1DiegoAlor.examen.dao.Detalle_pedidoDao;
import pe.edu.upeu.lp2exa1DiegoAlor.examen.entity.Detalle_pedido;
@Repository
public class Detalle_pedidoDaoImp implements Detalle_pedidoDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;


	@Override
	public Detalle_pedido read(int id) {
		// TODO Auto-generated method stub
        String SQL = "SELECT * FROM detalle_pedido WHERE iddetalle_pedido=?";
		return jdbcTemplate.queryForObject(SQL, new Object[]{id} , new BeanPropertyRowMapper<Detalle_pedido>(Detalle_pedido.class)) ;
	}


}
