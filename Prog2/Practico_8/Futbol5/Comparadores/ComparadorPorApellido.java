package Futbol5.Comparadores;

import java.util.Comparator;

import Futbol5.Socio;

public class ComparadorPorApellido implements Comparator<Socio>{

	@Override
	public int compare(Socio o1, Socio o2) {
		return o1.getApellido().compareTo(o2.getApellido());
	}
	
}
