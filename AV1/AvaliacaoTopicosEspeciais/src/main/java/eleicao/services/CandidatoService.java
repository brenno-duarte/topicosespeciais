package eleicao.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eleicao.domain.Candidato;
import eleicao.repositories.CandidatoRepository;

@Service
public class CandidatoService {
	
	@Autowired
	private CandidatoRepository repo;
	
	public Candidato buscarCandidatos(Integer id) {
		Optional<Candidato> can = repo.findById(id);
		
		return can.orElse(null);
	}
}
