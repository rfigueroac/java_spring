package pe.edu.upc.dsd.domain;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Coleccion {
	String codigo;
	String nombre;
	String numerofotos;
	List<Foto> fotos;
	Usuario usuario;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumerofotos() {
		return numerofotos;
	}

	public void setNumerofotos(String numerofotos) {
		this.numerofotos = numerofotos;
	}

	public List<Foto> getFotos() {

		return fotos;
	}

	public void setFotos(List<Foto> fotos) {
		this.fotos = fotos;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
