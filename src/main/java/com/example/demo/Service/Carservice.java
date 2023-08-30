package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Car;
import com.example.demo.Repository.Carrepo;

@Service
public class Carservice {
	@Autowired
	Carrepo cr;
	public List<Car> saveinfo(List<Car> c)
	{
		return cr.saveAll(c);
	}
	public List<Car> getinfobyowner(int s)
	{
		return cr.getbyowner(s);
	}
	public List<Car> getinfobyaddress(String s)
	{
		return cr.getbyaddress(s);
	}
	public List<Car> getinfobycarname(String s)
	{
		return cr.getbycarname(s);
	}
	public List<Car> getbycarowner(int s,String b)
	{
		return cr.getinfo(s, b);
	}

}