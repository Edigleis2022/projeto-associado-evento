package br.edu.ifmsnv.associadoeventos.model.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifmsnv.associadoeventos.model.entities.Associado;
import br.edu.ifmsnv.associadoeventos.model.mapper.AssociadoMapper;

public interface AssociadoRepository extends JpaRepository<Associado, UUID> {

	Boolean existByEmail(String email);
	Boolean existByCpf(String cpf);
	
	/*Desvantagem não sabe se a consulta retornada é cpf ou email*/
	Boolean existByCpfOrEmail(String cpf, String email);
	void save(AssociadoMapper associado);
}
