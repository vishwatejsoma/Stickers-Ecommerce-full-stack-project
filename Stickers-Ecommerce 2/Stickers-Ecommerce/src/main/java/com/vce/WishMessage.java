package com.vce;

import java.time.LocalTime;

import org.springframework.stereotype.Component;

@Component
public class WishMessage {
	
	public String wishMessageGenerator() {
		LocalTime time = LocalTime.now();
		int hour = time.getHour();
		
		if(hour>=4 && hour<12) {
			return "Good morning!";
		}else if(hour>=12 && hour<17) {
			return "Good afternoon!";
		}else if(hour>=17 && hour < 21) {
			return "Good evening!";
		}else {
			return "Good night!";
		}
		
	}

}
