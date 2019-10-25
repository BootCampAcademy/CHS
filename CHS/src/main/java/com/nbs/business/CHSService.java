package com.nbs.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nbs.persistence.repository.CHSRepository;

import antlr.collections.List;

@Service
public class CHSService {
		@Autowired
		private CHSRepository repository;
		
		public List<CHS> getAllCHS(){
			return repository.findAll();
		}
		
		
		public CHS saveCHS(CHS CHSToSave) {
			return repository.save(CHSToSave)
		}
		
		public CHS updateCHS(CHS CHSToUpdate) {
			return repository.save(CHSToUpdate)
		}
		
		public String deleteCHS (Long CHSIdToDelete) {
			repository.deletebyId(CHSToDelete);
			return "you have been deleted";
		}
		
		
}
