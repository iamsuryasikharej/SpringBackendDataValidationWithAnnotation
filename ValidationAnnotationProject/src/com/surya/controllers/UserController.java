package com.surya.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.surya.domain.User;

@Controller
@RequestMapping(value="/")
public class UserController 
{
	@RequestMapping(value="/reg",method=RequestMethod.GET)
	public String getForm(Model m)
	{
		m.addAttribute("user",new User());
		return "registeruser";
	}
	@RequestMapping(value="/reg",method=RequestMethod.POST)
	public String submitForm(@ModelAttribute("user")@Valid User user,BindingResult errors,Model m)
	{m.addAttribute("user",user);
		if(errors.hasErrors()) {
		m.addAttribute("user",user);
		return "registeruser";
		}
		else
		{
			return "userdetails";
		}
	}

}
