package br.edu.ifmsnv.associadoeventos.model.services;

import br.edu.ifmsnv.associadoeventos.config.utils.MD5;
import br.edu.ifmsnv.associadoeventos.model.dto.AssociadoDto;
import br.edu.ifmsnv.associadoeventos.model.entities.Associado;
import br.edu.ifmsnv.associadoeventos.model.mapper.AssociadoMapper;
import br.edu.ifmsnv.associadoeventos.model.repositories.AssociadoRepository;


public class AssociadoService {

	private final AssociadoRepository repository;

	public AssociadoService(AssociadoRepository repository) {
		super();
		this.repository = repository;
	}

	public AssociadoDto create(AssociadoDto associadoDto2) {
		
		if(repository.existByCpf(associadoDto2.getCpf())) {
			throw new RuntimeException("CPF já existe para outro associado");
		}
		/*if(repository.existByEmail(associadoDto2.getEmail())) {
			throw new RuntimeException("Email já existe para outro associado");
		}*/
		
		//if(repository.existByCpfOrEmail(estudanteDto.getCpf(), estudante.getEmail())) {
		//	throw new RuntimeException("Email já existe para outro associado");
		//}
		
		associadoDto2.setNome(associadoDto2.getNome().toUpperCase());
		associadoDto2.setEmail(associadoDto2.getEmail().toLowerCase());
		associadoDto2.setSenha( MD5.encode(associadoDto2.getSenha()));
		
		Associado associado = AssociadoMapper.dtoToEntity(associadoDto2);
		repository.save(associado);
		
		return AssociadoMapper.entityToDto(associado);
	}
	
}
