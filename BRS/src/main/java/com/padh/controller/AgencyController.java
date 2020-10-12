package com.padh.controller;

import java.net.URI;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.padh.error.AgentNotFoundException;
import com.padh.model.Agency;
import com.padh.repository.AgencyRepository;

@RestController
@RequestMapping("/masters") 
public class AgencyController {

	@Autowired
	AgencyRepository agencyRepository;
	
	
@GetMapping("/agencies")	
public  ResponseEntity<Iterable<Agency>> fetchAgencies(){
	
	return ResponseEntity.ok().body(agencyRepository.findAll());
	
	
}
@GetMapping("/agencies/{id}")	
public  ResponseEntity<Agency> fetchAgency(@PathVariable long id){
	Optional<Agency> agency  =agencyRepository.findById(id);
	
	if (!agency.isPresent())
		throw new AgentNotFoundException("No Agency Found for ID : "+id);
	
	return  ResponseEntity.ok().body(agency.get());
	
	
}

@PostMapping("/agencies")
public ResponseEntity<Object> createAgency(@RequestBody Agency agency) {
	Agency savedAgency = agencyRepository.save(agency);
	
	URI location = ServletUriComponentsBuilder
			.fromCurrentRequest()
			.path("/{id}")
			.buildAndExpand(savedAgency.getId()).toUri();
	return ResponseEntity.created(location ).build();
}

@DeleteMapping("/agencies/{id}")
public ResponseEntity<Object> deleteAgency(@PathVariable long id){
Optional<Agency> agency  =agencyRepository.findById(id);
	
	if (!agency.isPresent())
		throw new AgentNotFoundException("No Agency Found for ID : "+id);
	agencyRepository.delete(agency.get());
	return ResponseEntity.accepted().build();
}


}
