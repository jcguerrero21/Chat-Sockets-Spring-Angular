package jotace.spring.boot.sockets.service;

import java.util.List;

import jotace.spring.boot.sockets.documents.Mensaje;

public interface ChatService {
	
	List<Mensaje> obtenerUltimos10Mensajes();
	
	Mensaje guardar(Mensaje mensaje);
	
}
