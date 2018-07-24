package com.latam.poc.openweather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//import com.latam.pax.demo.hibernate.demoHibernate.service.AddressService;

/**
 * 
 * @author cvargasm
 *
 */
@RestController
public class WeatherController {

	@RequestMapping(value = "/currentWeather", method = RequestMethod.GET, produces = MediaType.APPLICATION_XML_VALUE)
	public ResponseEntity<String> currentWeather(@RequestParam("city") String city, @RequestParam("metric") String metric)
			throws Exception {
		return new ResponseEntity<String>(city +" - "+metric, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/validateCard", method = RequestMethod.GET, produces = MediaType.APPLICATION_XML_VALUE)
	public String validateCard()
			throws Exception {
		 String serverAddress ="10.8.125.50";
		return new StringBuilder().append("Hello from IP address: ").append(serverAddress).append("\n").toString();
	}

}
