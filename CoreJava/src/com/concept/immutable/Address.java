package com.concept.immutable;

public class Address {
	
	public String getAdd1() {
		return add1;
	}
	@Override
	public String toString() {
		return "Address [add1=" + add1 + ", city=" + city + ", pin=" + pin + "]";
	}
	public void setAdd1(String add1) {
		this.add1 = add1;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	private String add1;
	private String city;
	private int pin;
	public Address(String add1, String city, int pin) {
		super();
		this.add1 = add1;
		this.city = city;
		this.pin = pin;
	}
	
	

}
