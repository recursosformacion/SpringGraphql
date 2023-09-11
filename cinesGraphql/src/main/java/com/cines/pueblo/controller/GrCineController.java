package com.cines.pueblo.controller;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.cines.pueblo.exception.ControllerException;
import com.cines.pueblo.model.Cine;
import com.cines.pueblo.model.Entrada;
import com.cines.pueblo.service.CineService;
import com.cines.pueblo.service.EntradaService;

@CrossOrigin
@Controller

public class GrCineController {

	@Autowired
	private CineService cDaoCine;
	
	@Autowired
	private EntradaService cDaoEntrada;

	@QueryMapping
	public List<Cine> listarCines() throws ControllerException {

		return cDaoCine.listAll();

	}
	
	@QueryMapping
	public List<Entrada> listarEntradas() throws ControllerException {

		return cDaoEntrada.listAll();

	}

	@QueryMapping
	public Cine listarCine(@Argument(name = "id_cine" ) int id) throws ControllerException {
		String mensaje = "";

		try {

			Optional<Cine> cineDB = (Optional<Cine>) cDaoCine.leerUno(Long.valueOf(id));

			if (cineDB.isPresent()) {
				return cineDB.get();
			} else {
				mensaje = "No existen datos";
			}
		} catch (NumberFormatException nfe) {
			mensaje = "Formato erroneo";
		}

		throw new ControllerException(mensaje);

	}
}
