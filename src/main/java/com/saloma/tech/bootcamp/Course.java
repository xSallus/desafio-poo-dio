package com.saloma.tech.bootcamp;






public class Course extends Content {
	private Integer workload;

	public Course(String title, String description, int workload) {
		super(title, description);
		this.workload = workload;
	}

	public Integer getWorkload() {
		return this.workload;
	}

	@Override
	public double calculateXP() {
			return Content.XP_DEFAULT + 100d;
	}

	@Override
	public String toString() {
		return "{Course:"+this.getTitle()+"("+this.workload+"hrs)}";
	}
}
