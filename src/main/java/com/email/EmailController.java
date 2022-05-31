package com.email;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {


	@GetMapping("email")
	public String sendMail() {
		System.out.println("Got order sending email");
		return "send successfully";
	}
	
	@PostMapping("sendEmail")
	public String sendMail(@RequestBody String email) {
		System.out.println("Email send to the mail id " + email);
		return "send successfully";
	}
}
