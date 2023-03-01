package com.saloma.tech.bootcamp;

import java.time.LocalDateTime;

public class Mentoring extends Content {
	private LocalDateTime schedule;

	public Mentoring(
			String title, String description, LocalDateTime schedule) {
		super(title, description);
		this.schedule = schedule;
	}

	public LocalDateTime getSchedule() {
		return this.schedule;
	}

	@Override
	public double calculateXP() {
		return Content.XP_DEFAULT + 20d;
	}

	@Override
	public String toString() {
		return "{Mentoring:"+this.getTitle()+"("+this.schedule+")}";
	}
}
