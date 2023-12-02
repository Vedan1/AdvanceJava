package com.springCdac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class Car implements Vehicle{
	@Autowired
	private Tyres tyre;
	public void drive() {
		System.out.println("Car Dancing" + tyre);
	}
}
