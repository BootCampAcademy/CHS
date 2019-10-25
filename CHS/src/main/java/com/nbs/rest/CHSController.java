package com.nbs.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nbs.business.CHS;
import com.nbs.business.CHSService;

import antlr.collections.List;

@RestController
@RequestMapping("/CHSapp")
public class CHSController {

	
	@Autowired
	private CHSService chsservice;
	
	@GetMapping(value="CHS")
	public List<CHS> getAllCHS(){
		return chsservice.getAllCHS();
	}
	
	@PostMapping(value="CHS")
	public CHS saveCHS(@RequestBody CHS CHSToSave) {
		return chsservice.save(CHSToSave)
	}
	
	@PutMapping(value="CHS")
	public CHS updateCHS(@RequestBody CHS CHSToUpdate) {
		return chsservice.save(CHSToUpdate)
	}
	
	@DeleteMapping(value="CHS/{CHSIdToDelete")
	public String deleteCHS (@PathVariable Long CHSIdToDelete) {
		chsservice.deletebyId(CHSIdToDelete);
		return "you have been deleted";
	}
	
}
