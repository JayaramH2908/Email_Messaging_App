package com.example.Email.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Email.Entity.Email;
import com.example.Email.Service.EmailService;

import jakarta.servlet.http.HttpSession;

@Controller
public class EmailController {
	
	@Autowired 
	private EmailService emailService;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@PostMapping("/sendMail")
	public String sendMail(@ModelAttribute Email email) {
		emailService.sendMail(email);
		System.out.println("Email sent sucessfully");
		return "redirect:/";
		}

}
