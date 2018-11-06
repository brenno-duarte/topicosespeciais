package fvs.edu.br.topicos.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fvs.edu.br.topicos.domain.Pedido;
import fvs.edu.br.topicos.repositories.PedidoRepository;
import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class PedidoService {
	@Autowired
	private PedidoRepository repository;

	public Pedido buscar(Integer id) throws ObjectNotFoundException {
		Optional<Pedido> obj = repository.findById(id);
		return obj.orElse(null);
	}
}
