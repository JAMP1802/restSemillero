package com.clearminds.jmp.servicios;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import com.clearminds.jmp.dtos.Estudiante;
import com.clearminds.jmp.excepciones.BDDException;


@Path("/estudiantes")
public class RestEstudiantes {

	ServicioEstudiante srvEstudiante = new ServicioEstudiante();
	
	@Path("/insertar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void insertar(Estudiante estudiante){
		System.out.println(estudiante);
		try {
			srvEstudiante.insertarEstudiante(estudiante);
		} catch (BDDException e) {
			e.printStackTrace();
		}
	}
	
	@Path("/actualizar")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void actualizar(Estudiante estudiante){
		System.out.println(estudiante);
		try {
			srvEstudiante.actualizarEstudiante(estudiante);
		} catch (BDDException e) {
			e.printStackTrace();
		}
	}
}
