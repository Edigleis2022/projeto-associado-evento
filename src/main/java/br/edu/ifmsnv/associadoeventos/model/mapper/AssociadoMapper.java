package br.edu.ifmsnv.associadoeventos.model.mapper;

import br.edu.ifmsnv.associadoeventos.model.dto.AssociadoDto;
import br.edu.ifmsnv.associadoeventos.model.entities.Associado;

public class AssociadoMapper {

	public static Associado dtoToEntity( AssociadoDto associadoDto ) {
		Associado associado = new Associado();
		associado.setNome( associadoDto.getNome() );
		associado.setCpf( associadoDto.getCpf() );
		associado.setEmail( associadoDto.getEmail() );
		associado.setSenha( associadoDto.getSenha() );
		return associado;
	}
	
	public static AssociadoDto entityToDto(Associado associado) {
		AssociadoDto associadoDto = new AssociadoDto();
		associadoDto.setId( associado.getId() );
		associadoDto.setNome( associado.getNome() );
		associadoDto.setCpf( associado.getCpf() );
		associadoDto.setEmail( associado.getEmail() );
		return associadoDto;
	}

}
