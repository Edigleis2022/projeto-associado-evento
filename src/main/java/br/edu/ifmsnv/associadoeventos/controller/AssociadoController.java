package br.edu.ifmsnv.associadoeventos.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifmsnv.associadoeventos.controller.dto.AssociadoRequest;
import br.edu.ifmsnv.associadoeventos.controller.dto.AssociadoResponse;
import br.edu.ifmsnv.associadoeventos.controller.mapper.AssociadoMapper;
import br.edu.ifmsnv.associadoeventos.model.dto.AssociadoDto;
import br.edu.ifmsnv.associadoeventos.model.services.AssociadoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.Schema;

@RestController
@RequestMapping("/associado")
@Tag(name = "Associado", description = "Gerenciamento de Eventos")
public class AssociadoController {
	private final AssociadoService associadoService;
	
	public AssociadoController(AssociadoService associadoService) {
		this.associadoService = associadoService;
	}

	@GetMapping
	public ResponseEntity<String> olamundo() {
		return ResponseEntity.ok("Olá Mundo");
	}

	@Operation(summary = "Novo evento", description = "Serviço para cadastrar um evento")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Operação de sucesso", content = @Content(mediaType = "application/json", schema = @Schema(implementation = AssociadoResponse.class))),
			@ApiResponse(responseCode = "500", description = "Falha no serviço", content = @Content) })
	@PostMapping
	public ResponseEntity<AssociadoResponse> create(@RequestBody @Valid AssociadoRequest associadoRequest) {
		
		AssociadoDto associado = AssociadoMapper.requestToDto(associadoRequest);
		AssociadoDto associadoDto2 = associadoService.create(associado);
		
		AssociadoResponse associadoResponse = AssociadoMapper.dtoToResponse(associadoDto2);
		return ResponseEntity.ok(associadoResponse);
	}
}
