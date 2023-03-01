package com.saloma.tech.bootcamp;

public abstract class Content {
	protected final static Double XP_DEFAULT = 10d;

	private String title;
	private String description;

	public Content(String title, String description) {
		this.description = description;
		this.title = title;
	}

	public abstract double calculateXP( );

	public String getTitle() {
		return this.title;
	}

	public String getDescription() {
		return this.description;
	}

	@Override
	public String toString() {
		return this.title + this.description;
	}
}
