package com.java.Container;



import java.time.LocalDateTime;

public class Facebook{
	
	private String who; //julie
	private String what; // missed
	private LocalDateTime when; //10-Oct-2021 12:30:00
	
	public Facebook(String who, String what, LocalDateTime when) {
		super();
		this.who = who;
		this.what = what;
		this.when = when;
	}
	
	@Override
	public String toString() {
		return "Facebook [who=" + who + ", what=" + what + ", when=" + when + "]";
	}

}


