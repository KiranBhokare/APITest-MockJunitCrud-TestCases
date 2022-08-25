package com.mockJunit.crud.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mockJunit.crud.Pojo.Car;
import com.mockJunit.crud.dao.CarRepository;

@Service
public class CarServiceImpl implements CarService
{
     @Autowired
     CarRepository carDao;
     
     
     public Car getCarDetail(int id)
     {
    	 
    	Optional<Car> detail = carDao.findById(id);
    	
    	Car res = detail.get();
    	
    	return res;
    	 
  	 
     }
     
     
	
	
	
}
