package service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dto.CitizenDTO;

import entity.Citizen;

import repository.CitizenRepository;


@Service
public class CitizenServiceImpl implements CitizenService{
	@Autowired
	private CitizenRepository citizenRepository;
	private ModelMapper modelMapper;

	@Override
	public CitizenDTO createCitizen(CitizenDTO citizen) {
		
		Citizen citizenMst = modelMapper.map(citizen, Citizen.class);
		Citizen savedCitizen = citizenRepository.save(citizenMst);
		return modelMapper.map(savedCitizen, CitizenDTO.class);
	
	}

}
