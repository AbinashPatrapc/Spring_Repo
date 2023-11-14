package com.nt.beans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	@Autowired
	private LocalDateTime ltd;

	public String wishGenerator(String user) {
		int hour = ltd.getHour();
		if (hour < 11)
			return "Good Morning " + user;
		if (hour < 13)
			return "Good Noon " + user;
		if (hour < 16)
			return "Good AfterNoon " + user;
		if (hour < 20)
			return "Good Evening " + user;
		else
			return "Good Night " + user;
	}
}
