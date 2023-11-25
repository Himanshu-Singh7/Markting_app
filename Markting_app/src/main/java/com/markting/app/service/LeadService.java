package com.markting.app.service;
import java.util.List;

import com.markting.app.entity.Lead;
import com.markting.app.payload.LeadDto;

public interface LeadService {

	public void saveLead(Lead lead);
	
	public List<Lead> getAllLeads();

	public void deletelead(long id);
	
	public Lead findLead(long id);
	
	public void updateLead(LeadDto leadDto);
}
