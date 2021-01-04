package com.ahasan.spring.coupling.tightly;

public class Subject {
	
	Topic t = new Topic();

	public void startReading() {
		t.understand();
	}
	
	public static void main(String[] args) {
		Subject subject = new Subject();
		subject.startReading();
	}
}
