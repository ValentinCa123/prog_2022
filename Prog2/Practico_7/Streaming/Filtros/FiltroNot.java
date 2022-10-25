package Streaming.Filtros;

import Streaming.Pelicula;

public class FiltroNot extends Filtro{
	private Filtro f1;
	
	public FiltroNot(Filtro f1) {
		this.f1 = f1;
	}
	
	public boolean cumple(Pelicula p) {
		return !f1.cumple(p);
	}
}
