package pe.edu.upc.dsd.domain;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Usuario {
	
	String codigo;
	String nombres;
	List<Coleccion> colecciones;

	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public List<Coleccion> getColecciones() {

		return colecciones;
	}
	public void setColecciones(List<Coleccion> colecciones) {
		this.colecciones = colecciones;
	}
	
	
}
