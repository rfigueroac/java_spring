package pe.edu.upc.dsd.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SimulaDB {

	public static List<Foto> getFotos() {

		List<Foto> fotos = new ArrayList<Foto>();
		fotos.add(getFoto());
		fotos.add(getFoto());
		fotos.add(getFoto());
		fotos.add(getFoto());
		fotos.add(getFoto());
		fotos.add(getFoto());
		fotos.add(getFoto());
		fotos.add(getFoto());
		fotos.add(getFoto());
		fotos.add(getFoto());
		return fotos;
	}

	public static List<Coleccion> getColeccions() {
		List<Coleccion> colecciones = new ArrayList<Coleccion>();
		colecciones.add(getColeccion());
		colecciones.add(getColeccion());
		colecciones.add(getColeccion());
		colecciones.add(getColeccion());
		colecciones.add(getColeccion());
		colecciones.add(getColeccion());
		colecciones.add(getColeccion());
		return colecciones;
	}

	public static Foto getFoto() {

		Foto foto = new Foto();
		foto.setNombre("foto1");
		foto.setTamano("20X40");
		foto.setUri("http://foto1");

		Coleccion c = new Coleccion();
		c.setCodigo("0001");
		c.setNombre("Album 1");
		c.setNumerofotos("1");

		foto.setColeccion(c);

		return foto;

	}
	
	public static Coleccion getColeccion(){
		
	
		
		Coleccion c = new Coleccion();
		c.setCodigo("0001");
		c.setNombre("Album 1");
		c.setNumerofotos("1");
		
		Usuario usuario = new Usuario();
		usuario.setCodigo("0001");
		usuario.setNombres("Ricardo");
		
		c.setUsuario(usuario);
		
		return c;
	}
	
	public static Usuario getUsuario(){
		
		Usuario usuario = new Usuario();
		usuario.setCodigo("0001");
		usuario.setNombres("Ricardo");
		
		List<Coleccion> colecciones = new ArrayList<Coleccion>();
		
		Coleccion c1 = new Coleccion();
		c1.setCodigo("0001");
		c1.setNombre("Album 1");
		c1.setNumerofotos("1");
		
		Coleccion c2 = new Coleccion();
		c2.setCodigo("0001");
		c2.setNombre("Album 1");
		c2.setNumerofotos("1");
		
		Coleccion c3 = new Coleccion();
		c3.setCodigo("0001");
		c3.setNombre("Album 1");
		c3.setNumerofotos("1");
		
		colecciones.add(c1);
		colecciones.add(c2);
		colecciones.add(c3);
		
		usuario.setColecciones(colecciones);
		
		return usuario;
	}

}
