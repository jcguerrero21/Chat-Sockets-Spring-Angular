package jotace.spring.boot.sockets.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jotace.spring.boot.sockets.dao.ChatDAO;
import jotace.spring.boot.sockets.documents.Mensaje;

@Service
public class ChatServiceImpl implements ChatService {
	
	@Autowired
	private ChatDAO chatDao;
	
	@Override
	public List<Mensaje> obtenerUltimos10Mensajes() {
		return chatDao.findFirst10ByOrderByFechaDesc();
	}

	@Override
	public Mensaje guardar(Mensaje mensaje) {
		return chatDao.save(mensaje);
	}

}
