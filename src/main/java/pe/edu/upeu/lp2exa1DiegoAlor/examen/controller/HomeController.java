package pe.edu.upeu.lp2exa1DiegoAlor.examen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.lp2exa1DiegoAlor.examen.entity.Usuario;
import pe.edu.upeu.lp2exa1DiegoAlor.examen.security.JwtUtil;


@RestController
public class HomeController {
	@Autowired
	private AuthenticationManager authenticationManager;
	@Autowired
    private JwtUtil jwtUtil;
	@GetMapping("/")
	public String mensaje() {
		return "Bienvenido  a mi Examen";
	}
	@PostMapping("/authenticate")
	public String generateToken(@RequestBody Usuario authRequest) throws Exception {
        try {
        	System.out.println(authRequest.getNomuser());
           // authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequest.getNomuser(), authRequest.getClave()));
        } catch (Exception ex) {
            throw new Exception("Error: "+ex);
        }
return jwtUtil.generateToken(authRequest.getNomuser());
    }
}
