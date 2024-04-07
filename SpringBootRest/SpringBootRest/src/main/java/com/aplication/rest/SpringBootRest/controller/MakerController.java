package com.aplication.rest.SpringBootRest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aplication.rest.SpringBootRest.models.dtos.MakerDTO;
import com.aplication.rest.SpringBootRest.services.IMarkerService;

@RestController
@RequestMapping("rest/maker")
public class MakerController {

	private final IMarkerService makerService;
	
	public MakerController(IMarkerService makerService) {
		super();
		this.makerService = makerService;
	}

	@GetMapping("all")
	public ResponseEntity<List<MakerDTO>> getAll(){
		return ResponseEntity.ok(this.makerService.getAll()) ;
	}
	
	@GetMapping("find/{id}")
	public ResponseEntity<?> findById(@PathVariable Long id) {
		Optional<MakerDTO> makerDTO = this.makerService.getById(id);
		if(makerDTO.isPresent()) {
			return ResponseEntity.ok(makerDTO.get());
		}
		return ResponseEntity.notFound().build(); 
	}
	@GetMapping("find-by-name/{name}")
	public ResponseEntity<?> findByName(@PathVariable String name) {
		Optional<MakerDTO> makerDTO = this.makerService.getByName(name);
		if(makerDTO.isPresent()) {
			return ResponseEntity.ok(makerDTO.get());
		}
		return ResponseEntity.notFound().build(); 
	}
	
}
