package com.autowireex;

public class ExampleStatus {
	private String status;

	public ExampleStatus() {
       System.out.println("In status class....");
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ExampleStatus [status=" + "pending....." + "]";
	}
	void print(){
		System.out.println("hello this status class");
		}
}
