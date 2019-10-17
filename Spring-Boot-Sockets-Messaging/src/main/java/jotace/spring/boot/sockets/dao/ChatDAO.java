package jotace.spring.boot.sockets.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import jotace.spring.boot.sockets.documents.Mensaje;

public interface ChatDAO extends MongoRepository<Mensaje, String> {
	
	List<Mensaje> findFirst10ByOrderByFechaDesc();
}
