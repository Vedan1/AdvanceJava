package com.cdac;
import javax.persistence.*;
import javax.persistence.Id;
@Entity
public class Alien {
@Id
	private int e_id;
	private String e_name;
	private String e_color;
	
	public int getE_id() {
		return e_id;
	}
	public void setE_id(int i) {
		this.e_id = i;
	}
	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	public String getE_color() {
		return e_color;
	}
	public void setE_color(String e_color) {
		this.e_color = e_color;
	}
	
	

}
