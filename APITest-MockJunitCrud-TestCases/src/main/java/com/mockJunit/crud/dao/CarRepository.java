package com.mockJunit.crud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mockJunit.crud.Pojo.Car;

public interface CarRepository  extends JpaRepository<Car,Integer>
{

}
