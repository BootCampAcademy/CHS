package com.nbs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.nbs.business.CHSService;
import com.nbs.persistence.domain.CHS;


@RestController
@RequestMapping("/CHS")
@CrossOrigin("*")
public class CHSController {

	
	@Autowired
	private CHSService chsservice;
	
	@GetMapping
	public List<CHS> getAllCHS(){
		return chsservice.getAllCHS();
	}
	
	@PostMapping
	public CHS addCHS(@RequestBody CHS CHSToSave) {
		return chsservice.saveCHS(CHSToSave);
	}
	
	@PutMapping
	public CHS updateCHS(@RequestBody CHS CHSToUpdate) {
		return chsservice.updateCHS(CHSToUpdate);
	}
	
	@DeleteMapping(value="/{CHSIdToDelete}")
	public String deleteCHS (@PathVariable Long CHSIdToDelete) {
		chsservice.deleteCHS(CHSIdToDelete);
		return "Curry House entry has been deleted";
	}
	
}
