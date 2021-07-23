package com.autowireex;

public class Example {
	private String message;
	 ExampleStatus estatus;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public ExampleStatus getEstatus() {
		return estatus;
	}
	public void setEstatus(ExampleStatus estatus) {
		this.estatus = estatus;
	}
	@Override
	public String toString() {
		return "Example [message=" + "messaging...." + "]";
	}
	void print(){
		System.out.println("hello this message class");
		}  
	void display(){  
	    print();  
	   estatus.print();  
	}  

}
