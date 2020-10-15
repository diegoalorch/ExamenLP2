package pe.edu.upeu.lp2exa1DiegoAlor.examen.daoimp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.lp2exa1DiegoAlor.examen.dao.UsuarioDao;
import pe.edu.upeu.lp2exa1DiegoAlor.examen.entity.Usuario;



@Repository
public class UsuarioDaoImp implements UsuarioDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public Usuario read(String nomuser) {
		String SQL = "select * from usuario where nomuser = ?";
		return jdbcTemplate.queryForObject(SQL, new Object[] {nomuser}, new BeanPropertyRowMapper<Usuario>(Usuario.class));
	}

}
