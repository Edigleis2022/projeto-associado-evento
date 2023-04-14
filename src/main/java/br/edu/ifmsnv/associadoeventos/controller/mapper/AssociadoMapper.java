package br.edu.ifmsnv.associadoeventos.controller.mapper;

import br.edu.ifmsnv.associadoeventos.controller.dto.AssociadoRequest;
import br.edu.ifmsnv.associadoeventos.controller.dto.AssociadoResponse;
import br.edu.ifmsnv.associadoeventos.model.dto.AssociadoDto;

public class AssociadoMapper {

	public static AssociadoDto requestToDto( AssociadoRequest associadoRequest ) {
		AssociadoDto associadoDto = new AssociadoDto();
		associadoDto.setNome( associadoRequest.getNome() );
		associadoDto.setCpf( associadoRequest.getCpf() );
		associadoDto.setEmail( associadoRequest.getEmail() );
		associadoDto.setSenha( associadoRequest.getSenha() );
		return associadoDto;
	}
	
	public static AssociadoResponse dtoToResponse( AssociadoDto associadoDto ) {
		AssociadoResponse associadoResponse = new AssociadoResponse();
		associadoResponse.setId( associadoDto.getId() );
		associadoResponse.setNome( associadoDto.getNome() );
		associadoResponse.setCpf( associadoDto.getCpf() );
		associadoResponse.setEmail( associadoDto.getEmail() );
		return associadoResponse;
	}
}
