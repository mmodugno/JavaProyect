package Vinculador;

import java.util.List;

import egreso.Egreso;
import egreso.Ingreso;
import egreso.MontoSuperadoExcepcion;
import organizacion.EntidadJuridica;

public class Mix extends CriterioDeVinculacion {

	public Mix(List<CondicionObligatoria> condicionesObligatorias) {
		super(condicionesObligatorias);
	}
	
	private List<CriterioDeVinculacion> criteriosVinculacion;
	
	@Override // Revisar si se debe buscar la lista de Egresos e Ingresos dentro del método
    public void vincular(List<Egreso> egresos, List<Ingreso> ingresos, EntidadJuridica entidadJuridica) {
		
		criteriosVinculacion.stream().forEach(criterioVinculacion -> {
			try {
				criterioVinculacion.vincular(egresos, ingresos, entidadJuridica);
			} catch (ListaVaciaExcepcion | MontoSuperadoExcepcion listaVaciaExcepcion) {
				listaVaciaExcepcion.printStackTrace();
			}
		});
    }
	
	public void agregarCriterioVinculacion(CriterioDeVinculacion criterio) {
		criteriosVinculacion.add(criterio);
	}

}
