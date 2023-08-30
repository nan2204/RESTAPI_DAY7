package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Car;
import com.example.demo.Service.Carservice;

@RestController
public class Carcontroller {
	@Autowired
	Carservice cs;
	@PostMapping("addcar")
	public List<Car> add(@RequestBody List<Car> c)
	{
		return cs.saveinfo(c);
	}
	@GetMapping("get/{owners}")
	public List<Car> displaybyowner(@PathVariable int owners){
		return cs.getinfobyowner(owners);
	}
	@GetMapping("getadd/{address}")
	public List<Car> displaybyaddress(@PathVariable String address){
		return cs.getinfobyaddress(address);
	}
	@GetMapping("getcar/{carname}")
	public List<Car> displaybycarname(@PathVariable String carname){
		return cs.getinfobycarname(carname);
	}
	
	@GetMapping("getcarown/{owners}/{cartype}")
	public List<Car> displayAll(@PathVariable int owners,@PathVariable String cartype){
		return cs.getbycarowner(owners, cartype);
	}
	

}