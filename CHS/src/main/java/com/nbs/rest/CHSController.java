package com.nbs.rest;

import com.nbs.business.CHS;

import antlr.collections.List;

@RestController
@RequestMapping("/CHSapp")
public class CHSController {

	
	@Autowired
	private CHSService = chsservice;
	
	@GetMapping(value="CHS")
	public List<CHS> getAllCHS(){
		return chsservice.getAllCHS();
	}
	
	@PostMapping(value="CHS")
	public CHS saveCHS(@RequestBody CHS CHSToSave) {
		return repository.save(CHSToSave)
	}
	
	@PutMapping(value="CHS")
	public CHS updateCHS(@RequestBody CHS CHSToUpdate) {
		return repository.save(CHSToUpdate)
	}
	
	@DeleteMapping(value="CHS/{CHSIdToDelete")
	public String deleteCHS (@PathVariable Long CHSIdToDelete) {
		repository.deletebyId(CHSIdToDelete);
		return "you have been deleted";
	}
	
}
