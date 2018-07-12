package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Hotels")
public class Hotel {

	@Id
	private String id;
	private String name;
	private Address address;
	@Indexed(direction=IndexDirection.ASCENDING)
	private int pricePerNight;
	private List<Review> reviews;
	
	protected Hotel() {
		this.reviews=new ArrayList<>();
	}
	
	public Hotel(String id,String name,Address address,int pricePerNight,List<Review> reviews) {
		this.id=id;
		this.name=name;
		this.address=address;
		this.pricePerNight=pricePerNight;
		this.reviews=reviews;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Address getAddress() {
		return address;
	}

	public int getPricePerNight() {
		return pricePerNight;
	}

	public List<Review> getReviews() {
		return reviews;
	}
	
	
	
}
