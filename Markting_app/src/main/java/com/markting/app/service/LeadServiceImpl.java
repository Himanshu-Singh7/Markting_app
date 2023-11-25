package com.markting.app.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.markting.app.entity.Lead;
import com.markting.app.repository.LeadRepository;

@Service
public class LeadServiceImpl implements LeadService {
    @Autowired
	private LeadRepository leadRepository;
	
	@Override
	public void saveLead(Lead lead) {
		this.leadRepository.save(lead);
		
	}

	@Override
	public List<Lead> getAllLeads() {
		
		List<Lead> leads = this.leadRepository.findAll();
		return leads;
	}

	@Override
	public void deletelead(long id) {
	   this.leadRepository.deleteById(id);
	   
	}

}
