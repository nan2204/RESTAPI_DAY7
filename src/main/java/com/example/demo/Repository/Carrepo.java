package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Car;
@Repository
public interface Carrepo extends JpaRepository<Car, Integer> {
	@Query(value="select * from car where owners=:s ",nativeQuery = true)
	public List<Car> getbyowner(@Param("s") int owners);
	
	@Query(value="select * from car where address=:s",nativeQuery = true)
	public List<Car> getbyaddress(@Param("s") String address);
	
	@Query(value="select * from car where carname=:s",nativeQuery = true)
	public List<Car> getbycarname(@Param("s") String carname);
	
	@Query(value="select * from car where owners=:s or cartype=:sn",nativeQuery = true)
	public List<Car> getinfo(@Param("s") int owners,@Param("sn") String cartype);

}