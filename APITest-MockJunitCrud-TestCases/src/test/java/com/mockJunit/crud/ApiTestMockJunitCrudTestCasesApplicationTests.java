package com.mockJunit.crud;

import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.mockJunit.crud.Pojo.Car;
import com.mockJunit.crud.dao.CarRepository;
import com.mockJunit.crud.service.CarServiceImpl;

import junit.framework.Assert;


@RunWith(MockitoJUnitRunner.class) //this annotation is used to make the bridge betwwen Junit & SpringBoot
@SpringBootTest
class ApiTestMockJunitCrudTestCasesApplicationTests {

	@Mock      // It will create dummy/mimics of an object
	CarRepository carDao;
	
	@Autowired
	CarServiceImpl carService;

	@Test
	public void getCarDetail()
	{
		int id = 15;
		
		Car detail = new Car(15,"Skoda",1500000);
		
		Mockito.when(carDao.findById(id)).thenReturn(Optional.ofNullable(new Car(15,"Skoda",1500000)));
		
		Assert.assertEquals(detail , carService.getCarDetail(id));	
		                  // expected     actual
	}

	
}
