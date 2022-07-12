package com.example.springproject8.springproject8.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springproject8.springproject8.Entity.City;
import com.example.springproject8.springproject8.Service.CityService;
@RestController
public class HomeController {
	@Autowired
	
	private CityService cityService;
//	@GetMapping("/home")
//	public String Test() {
//		return "hello this is sanket";
//	}
	@GetMapping("/homes")
	public List<City>getCities(){
		return this.cityService.getCities();
		
	}
}

	
	


	



	

