package com.cines.pueblo.service.util;

import java.time.LocalDate;
import java.util.Objects;

public class Rutinas {

	static public String nuevoSiNoVacio(String valorActual, String valorNuevo) {
		if (Objects.nonNull(valorNuevo) && !"".equalsIgnoreCase(valorNuevo)) {
			return valorNuevo;
		} else {
			return valorActual;
		}
	}

	static public int nuevoSiNoVacio(int valorActual, int valorNuevo) {
		if (Objects.nonNull(valorNuevo)) {
			return valorNuevo;
		} else {
			return valorActual;
		}
	}

	static public LocalDate nuevoSiNoVacio(LocalDate valorActual, LocalDate valorNuevo) {
		if (Objects.nonNull(valorNuevo)) {
			return valorNuevo;
		} else {
			return valorActual;
		}
	}
	
	static public Object nuevoSiNoVacio(Object valorActual, Object valorNuevo) {
		if (Objects.nonNull(valorNuevo)) {
			return valorNuevo;
		} else {
			return valorActual;
		}
	}

}
