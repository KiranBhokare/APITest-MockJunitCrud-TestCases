package com.mockJunit.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mockJunit.crud.Pojo.Car;
import com.mockJunit.crud.service.CarService;

@RestController
@RequestMapping("/carapi")
public class CarController 
{
     @Autowired
	 CarService carService;
	
	 @GetMapping("/Cars/getCarDetail/{id}")
     public ResponseEntity<Car>getCarDetail(@PathVariable ("id") String id )
	{		
		  Car data = carService.getCarDetail(Integer.parseInt(id));
		 
	      return ResponseEntity.ok(data);	
	      
	}
}	 
	
