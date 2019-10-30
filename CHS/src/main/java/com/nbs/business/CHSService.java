package com.nbs.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nbs.persistence.domain.CHS;
import com.nbs.persistence.repository.CHSRepository;


@Service
public class CHSService {
		@Autowired
		private CHSRepository repository;
		
		public List<CHS> getAllCHS(){
			return repository.findAll();
		}
		
		
		public CHS addCHS(CHS CHSToSave) {
			return repository.save(CHSToSave);
		}
		
		public CHS updateCHS(CHS CHSToUpdate) {
			return repository.save(CHSToUpdate);
		}
		
		public String deleteCHS (Long CHSIdToDelete) {
			repository.deleteById(CHSIdToDelete);
			return "you have been deleted";
		}
		
		
}
