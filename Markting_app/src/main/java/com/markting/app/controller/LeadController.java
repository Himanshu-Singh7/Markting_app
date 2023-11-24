package com.markting.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.markting.app.entity.Lead;
import com.markting.app.service.LeadService;

@Controller
public class LeadController {
	
	@Autowired
	private LeadService leadService;
    // Handler method
	//http://localhost:8282/view
	@RequestMapping("/view")
	public String viewCreateLeadForm() {
		
		System.out.println("This is lead Page");
		return "create_lead";
		
	}
	
	@RequestMapping(value = "/saveLead")
	public String saveLead(Lead lead) {
//		System.out.println(lead.getFirstName());
//		System.out.println(lead.getLastName());
//		System.out.println(lead.getEmail());
//		System.out.println(lead.getMobile());
		
		this.leadService.saveLead(lead);
		return "create_lead";
		
	}


}
