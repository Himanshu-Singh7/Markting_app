package com.markting.app.controller;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.markting.app.entity.Lead;
import com.markting.app.payload.LeadDto;
import com.markting.app.service.LeadService;

@Controller
public class LeadController {

	@Autowired
	private LeadService leadService;

	// Handler method
	// http://localhost:8282/view
	@RequestMapping("/view")
	public String viewCreateLeadForm() {

		System.out.println("This is lead Page");
		return "create_lead";

	}

	/*
	 * @RequestMapping(value = "/saveLead") public String saveLead(Lead lead ,Model
	 * model) { model.addAttribute("msg", "Lead is saved!!");
	 * this.leadService.saveLead(lead); return "create_lead";
	 * 
	 * }
	 */

	/*
	 * @RequestMapping("/saveLead") public String saveLead(
	 * 
	 * @RequestParam("first") String firstName,
	 * 
	 * @RequestParam("last") String lastName,
	 * 
	 * @RequestParam("email") String email,
	 * 
	 * @RequestParam("mobile") long mobile, Model model) {
	 * 
	 * Lead lead = new Lead(); lead.setFirstName(firstName);
	 * lead.setLastName(lastName); lead.setEmail(email); lead.setMobile(mobile);
	 * model.addAttribute("msg", "Lead is saved!!");
	 * this.leadService.saveLead(lead); return "create_lead";
	 * 
	 * }
	 */
	
	
	
    @RequestMapping("/saveLead")
	public String saveLead(
			LeadDto leadDto, Model model){
		
    	Lead lead = new Lead();
		
    	try {
    		lead.setFirstName(leadDto.getFirstName());
    		lead.setLastName(leadDto.getLastName());
    		lead.setEmail(leadDto.getEmail());
    		lead.setMobile(leadDto.getMobile());
    		model.addAttribute("msg", "Lead is saved!!");
    		this.leadService.saveLead(lead);
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return "create_lead";
		
		

	}
	
	@RequestMapping("/listall")
	public String getAllLeads(Model model) {
		
		List<Lead> leads = this.leadService.getAllLeads();
		System.out.println(leads);
		model.addAttribute("leads", leads);
	
		return "list_lead";
		
	}
	
	@RequestMapping("/delete")
	public String deleteLead(@RequestParam("id") long id , ModelMap model) {
		this.leadService.deletelead(id);
		List<Lead> leads = this.leadService.getAllLeads();
		model.addAttribute("leads", leads);
		return "list_lead";
		
	}

}
