package organizacion;

import java.util.ArrayList;
import java.util.List;
import egreso.*;
import usuarios.CategoriaDelSistema;

public class Organizacion {

	public Organizacion(){
		super();
		this.entidades = new ArrayList<EntidadJuridica>();
	}
	
	private List<EntidadJuridica> entidades;

	private List<CategoriaDelSistema> categorias = new ArrayList<CategoriaDelSistema>();
	
	public void agregarEntidad(EntidadJuridica entidad) {
		entidades.add(entidad);
	}

	
	public List<EntidadJuridica>  getEntidades() {
		return entidades;
	}
	
	public void agregarCategoria(CategoriaDelSistema categoria) {
		categorias.add(categoria);
	}
	
	public List<CategoriaDelSistema> getCategorias() {
		return this.categorias;
	}

	
	
	
	public List<Categorizable> obtenerCategorizables(CategoriaDelSistema unaCategoria){
		List<Categorizable> listaCat = new ArrayList<Categorizable>();
		
		entidades.forEach(e->e.devolverCategorias(listaCat, unaCategoria));
		
		return listaCat;
	}
	
	
}