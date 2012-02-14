package pe.edu.upc.dsd.examen;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import pe.edu.upc.dsd.domain.Coleccion;
import pe.edu.upc.dsd.domain.Foto;
import pe.edu.upc.dsd.domain.SimulaDB;
import pe.edu.upc.dsd.domain.Usuario;

@Path("/usuarios")
@Produces("application/json")
@Consumes("application/json")
public class UsuariosController {

	/**
	 * 
	 * @return
	 */
	@GET
	@Path("/{codigo}")
	public Usuario getUsuario() {
		return SimulaDB.getUsuario();
	}

	/**
	 * 
	 * @param codigo
	 * @param albuncodigo
	 * @return
	 */
	@GET
	@Path("/albun/{codigo}/{albuncodigo}")
	public Coleccion getAlbun(@PathParam("codigo") String codigo,@PathParam("albuncodigo") String albuncodigo) {
		return SimulaDB.getColeccion();
	}

	/**
	 * 
	 * @param codigo
	 * @param albuncodigo
	 * @return
	 */
	@GET
	@Path("/albun/foto/{codigo}/{albuncodigo}")
	public Foto getFoto(@PathParam("codigo") String codigo,@PathParam("albuncodigo") String albuncodigo){
		return SimulaDB.getFoto();
	}
	
	/**
	 * 
	 * @param codigo
	 * @return
	 */
	@GET
	@Path("/albun/{codigo}")
	public List<Coleccion> getAlbuns(@PathParam("codigo") String codigo) {
		return SimulaDB.getColeccions();
	}
	
	/**
	 * 
	 * @param codigo
	 * @return
	 */
	@GET
	@Path("/albun/foto/{codigo}")
	public List<Foto> getFotos(@PathParam("codigo") String codigo){
		return SimulaDB.getFotos();
	}
}