package com.example.springproject8.springproject8.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springproject8.springproject8.Entity.City;
@Service
public class CityServiceImpl implements CityService {
	List<City>list;
	public CityServiceImpl() {
	list=new ArrayList<>();
	list.add(new City(123,"sanket","padole"));
	list.add(new City(33,"nikhil","paulkar"));
	}

	@Override
	public List<City> getCities() {
		// TODO Auto-generated method stub
		return list;
	}

}
