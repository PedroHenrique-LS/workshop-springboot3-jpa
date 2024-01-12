package com.educandoweb.course.entities.enums;

public enum OrderStatus {
	
	WAITING_PAYMENT(1),
	PAIND(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
	

	private int code;
	
	private OrderStatus(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}
	
	public static OrderStatus velueOf(int code) {
		for (OrderStatus statusCurrent : OrderStatus.values()) {
			if(statusCurrent.getCode() == code) 
				return statusCurrent;
		}
		throw new IllegalArgumentException("Invalid OrderStatus code");
	}
	
	
}
