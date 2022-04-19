package com.sip.ams.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/first")
public class FirstController {
	
	@RequestMapping("/hello")
	//@ResponseBody
	public String greeting(Model model)
	{
		System.out.println("Hello from Spring");
		//return "<h1 align=center>Hello Spring</h1>";
		String nom ="Amine";
		String fonction = "Professeur";
		
		List<String> cours = new ArrayList<>();
		
		cours.add("Java OCA");
		cours.add("Spring");
		cours.add("Java OCP");
		cours.add("Spring Microservices");
		
		model.addAttribute("name", nom);
		model.addAttribute("fnt", fonction);
		model.addAttribute("cours", cours);
		return "first/welcome";
	}

}
