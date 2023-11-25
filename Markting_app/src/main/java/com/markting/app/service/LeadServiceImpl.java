package com.markting.app.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import com.markting.app.entity.Lead;
import com.markting.app.exception.PropertyValueException;
import com.markting.app.payload.LeadDto;
import com.markting.app.repository.LeadRepository;


@Service
public class LeadServiceImpl implements LeadService {
    @Autowired
	private LeadRepository leadRepository;
	
	@Override
	public void saveLead(@ModelAttribute Lead lead) {
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

	@Override
	public Lead findLead(long id) {
		   Lead lead = this.leadRepository.findById(id).get();
				   
				   //.orElseThrow(() -> new PropertyValueException("Lead", "id", id));
		   return lead;
	}
	
	@Override
	public void updateLead(LeadDto leadDto) {
		Lead lead = new Lead();
		lead.setId(leadDto.getId());
		lead.setFirstName(leadDto.getFirstName());
		lead.setLastName(leadDto.getLastName());
		lead.setEmail(leadDto.getEmail());
		lead.setMobile(leadDto.getMobile());
		this.leadRepository.save(lead);
		
	}

}
