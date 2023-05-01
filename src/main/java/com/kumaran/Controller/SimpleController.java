package com.kumaran.Controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kumaran.bean.Login;
import com.kumaran.bean.VaccinationCenter;
import com.kumaran.services.VaccinationCenterService;
import com.kumaran.services.VaccinationCenterServiceImpl;

@Controller
public class SimpleController {
	
	@Autowired
	private VaccinationCenterService vaccinationCenterService;
	
	
	@RequestMapping("/")
	public String Welcome() {
		return "Home";
		
	}
	@GetMapping("/AdminLogin")
	public String AdminLogin() {
		return "AdminLogin";
	}
	
	@GetMapping("/AdminDashboard")
	public String Admindashboard() {
		
		return "AdminDashboard";
		
	}
	
	@PostMapping("/AdminDashboard")
	public ModelAndView AdminDashboard(@ModelAttribute("LoginData")Login login) {
		ModelAndView mv= new ModelAndView("AdminDashboard");
		System.out.println(login.getUsername());
		System.out.println(login.getPassword());
		if(login.getUsername().equals("Admin") && login.getPassword().equals("123"))
			return mv;
		else
			//mv.addObject("ErrorMessage","Please Enter Valid USERNAME or PASSWORD");
			return new ModelAndView("AdminLogin","err","!!Please Enter Valid USERNAME or PASSWORD");
		
	}
	@GetMapping("/logout")
	public String doLogout(HttpSession session,Model model) {
		
		session.invalidate();
		
		Login login =new Login();
		
		model.addAttribute("loginData",login);
		
		return "AdminLogin";
		
	}
	@GetMapping("/AddCenter")
	public String AddCenter(Model model) {
		
		VaccinationCenter vaccinationCenter= new VaccinationCenter();
		model.addAttribute("CenterData", vaccinationCenter);
		return "AddCenter";
	}
	
	
	@PostMapping("/AddCenterResult")
	public ModelAndView AddCenterResult(@Valid @ModelAttribute("CenterData")VaccinationCenter vaccinationCenter,BindingResult br){
		
		if(br.hasErrors()) {
			System.out.println(br);
			return new ModelAndView("AddCenter");
			
			
		}else {
//			VaccinationCenterService vaccinationCenterService= new VaccinationCenterServiceImpl();
			
			
			VaccinationCenter vc= vaccinationCenterService.addVaccinationCente(vaccinationCenter);
		    ModelAndView mv= new ModelAndView("AddCenterResult", "result",vc);
			System.out.println(vc);
			
			return mv;
		}
		
		
		
	}
	
	
	@GetMapping("/ListCenter")
	public ModelAndView listCenter() {
		
		List<VaccinationCenter> centerList= vaccinationCenterService.listVaccinationCenter();
		ModelAndView mv= new ModelAndView("ListCenter","ListCenter",centerList);
		for(VaccinationCenter vc:centerList) {
			System.out.println(vc);
		}
		
		return mv;
		
	}
	
	@GetMapping("/GetCenter")
	public ModelAndView getCenterById() {
		
	
		
		return null;
	}
	

	
	@GetMapping("/UserLogin")
	public String UserLogin() {
		return "UserLogin";
	}
	@PostMapping("/UserDashboard")
	public String UserDashboard() {
		return "UserDashboard";
	}
	@GetMapping("/UserSignup")
	public String UserSignup() {
		return "UserSignup";
	}
}
