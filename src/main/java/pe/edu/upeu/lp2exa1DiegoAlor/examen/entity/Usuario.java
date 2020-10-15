package pe.edu.upeu.lp2exa1DiegoAlor.examen.entity;

public class Usuario {
	private  int idusuario;
	private String nomuser;
	private  String clave;
	private String idpersona;
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}
	public String getNomuser() {
		return nomuser;
	}
	public void setNomuser(String nomuser) {
		this.nomuser = nomuser;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getIdpersona() {
		return idpersona;
	}
	public void setIdpersona(String idpersona) {
		this.idpersona = idpersona;
	}
	public Usuario(int idusuario, String nomuser, String clave, String idpersona) {
		super();
		this.idusuario = idusuario;
		this.nomuser = nomuser;
		this.clave = clave;
		this.idpersona = idpersona;
	}
	
	
	
}
