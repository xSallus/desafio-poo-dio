package com.saloma.tech.bootcamp;

import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import java.time.ZoneId;

import static java.util.UUID.randomUUID;;
//import java.util.ArrayList;
//import java.util.List;

public class Dev {
	private String taxId;
	private String name;
	private LocalDate birthday;
	//private List<String> enrollments;
	
	public Dev(String name, LocalDate birthday) {
		this.taxId = randomUUID().toString();
		this.name = name;
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public Long age() {
		LocalDate now = LocalDate.now(ZoneId.systemDefault());
		return ChronoUnit.YEARS.between(birthday, now);
	}

	protected String getTaxID() {
		return this.taxId;
	}

	@Override
	public String toString() {
		return "Dev@"+this.name+"(" + this.age() + ")";
	}
}
