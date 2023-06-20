package controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dto.CitizenDTO;
import jakarta.validation.Valid;
import service.CitizenService;

@RestController
@RequestMapping("/api/citizen")
public class CitizenController {

	@Autowired
	CitizenService citizenService;
	
	  @PostMapping("/citizens")
	    public ResponseEntity<String> createCitizen(@Valid @RequestBody CitizenDTO citizen) {
	        // Validate input
	        if (citizen.getName() == null || citizen.getName().isEmpty() ||
	                citizen.getAddress() == null || citizen.getAddress().isEmpty() ||
	                citizen.getDateOfBirth() == null || citizen.getDateOfBirth().after(new Date())) {
	            return ResponseEntity.badRequest().build();
	        }

	        // Save the citizen and return the created citizen ID
	      
	        citizenService.createCitizen(citizen);

	        return ResponseEntity.status(HttpStatus.CREATED).body("Citizen created with ID: " + citizen.getId());
	    }
	
	
	
}
