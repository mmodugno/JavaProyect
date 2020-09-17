package organizacion;

public class Rubro {
	
public Rubro(double vtasMicro, double vtasPequenia, double vtasMedianaTramoUno, double vtasMedianaTramoDos,
			int persMicro, int persPequenia, int persMedianaTramoUno, int persMedianaTramoDos) {
		this.vtasMicro = vtasMicro;
		this.vtasPequenia = vtasPequenia;
		this.vtasMedianaTramoUno = vtasMedianaTramoUno;
		this.vtasMedianaTramoDos = vtasMedianaTramoDos;
		this.persMicro = persMicro;
		this.persPequenia = persPequenia;
		this.persMedianaTramoUno = persMedianaTramoUno;
		this.persMedianaTramoDos = persMedianaTramoDos;
	}

	/*ATRIBUTOS*/
	double vtasMicro ;
	double vtasPequenia ;
	double vtasMedianaTramoUno ;
	double vtasMedianaTramoDos ;
	int persMicro ;
	int persPequenia ;
	int persMedianaTramoUno ;
	int persMedianaTramoDos ;

	/*GETTERS*/
	public double getVtasMicro() {
		return vtasMicro;
	}
	public double getVtasPequenia() {
		return vtasPequenia;
	}
	public double getVtasMedianaTramoUno() {
		return vtasMedianaTramoUno;
	}
	public double getVtasMedianaTramoDos() {
		return vtasMedianaTramoDos;
	}
	public int getPersMicro() {
		return persMicro;
	}
	public int getPersPequenia() {
		return persPequenia;
	}
	public int getPersMedianaTramoUno() {
		return persMedianaTramoUno;
	}
	public int getPersMedianaTramoDos() {
		return persMedianaTramoDos;
	}

	/*SETTERS*/
	public void setVtasMicro(double vtasMicro) {
		this.vtasMicro = vtasMicro;
	}
	public void setVtasPequenia(double vtasPequenia) {
		this.vtasPequenia = vtasPequenia;
	}
	public void setVtasMedianaTramoUno(double vtasMedianaTramoUno) {
		this.vtasMedianaTramoUno = vtasMedianaTramoUno;
	}
	public void setVtasMedianaTramoDos(double vtasMedianaTramoDos) {
		this.vtasMedianaTramoDos = vtasMedianaTramoDos;
	}
	public void setPersMicro(int persMicro) {
		this.persMicro = persMicro;
	}
	public void setPersPequenia(int persPequenia) {
		this.persPequenia = persPequenia;
	}
	public void setPersMedianaTramoUno(int persMedianaTramoUno) {
		this.persMedianaTramoUno = persMedianaTramoUno;
	}
	public void setPersMedianaTramoDos(int persMedianaTramoDos) {
		this.persMedianaTramoDos = persMedianaTramoDos;
	}
	
	public TipoEmpresa reClasificar(Double promedioDeVentas) {
		
		if(promedioDeVentas > this.vtasMedianaTramoDos) {
			return TipoEmpresa.MedianaTramo2;
		}
		
		if(promedioDeVentas > this.vtasMedianaTramoUno) {
			return TipoEmpresa.MedianaTramo1;
		}
		
		if(promedioDeVentas > this.vtasPequenia) {
			return TipoEmpresa.Pequenia;
		}
		
		return TipoEmpresa.Micro;
	}
	
	public TipoEmpresa reClasificarPorPersonal(int cantidadPersonal) {
		
		if(cantidadPersonal > this.persMedianaTramoDos) {
			return TipoEmpresa.MedianaTramo2;
		}
		
		if(cantidadPersonal > this.persMedianaTramoUno) {
			return TipoEmpresa.MedianaTramo1;
		}
		
		if(cantidadPersonal > this.persPequenia) {
			return TipoEmpresa.Pequenia;
		}
		
		return TipoEmpresa.Micro;
	}
	
	
	
	
}
