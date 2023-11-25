package com.markting.app.service;
import java.util.List;

import com.markting.app.entity.Lead;

public interface LeadService {

	public void saveLead(Lead lead);
	
	public List<Lead> getAllLeads();

	public void deletelead(long id);
}
