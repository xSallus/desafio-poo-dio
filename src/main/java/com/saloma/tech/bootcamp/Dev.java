package com.saloma.tech.bootcamp;

import java.lang.Object;
import java.util.Objects;
import java.util.Optional;

import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import java.time.ZoneId;

import static java.util.UUID.randomUUID;
import java.util.LinkedHashSet;
import java.util.Set;

import java.util.List;
import java.util.ArrayList;

public class Dev {
	private String taxId;
	private String name;
	private LocalDate birthday;

	private Set<Content> enroledContents;
	private Set<Content> finishedContents;
	
	public Dev(String name, String birthday) {
		this.taxId = randomUUID().toString();
		this.name = name;

		List<Integer> splittedBirth = new ArrayList<Integer>();

		for(String str : birthday.split("-")) {
			splittedBirth.add(Integer.parseInt(str));
		}

		this.birthday = LocalDate.of(
			splittedBirth.get(0), splittedBirth.get(1), splittedBirth.get(2));

		this.enroledContents = new LinkedHashSet<Content>();
		this.finishedContents = new LinkedHashSet<Content>();
	}

	public void enrolBootcamp(Bootcamp bootcamp) {
		this.enroledContents.addAll(bootcamp.getContents());
		bootcamp.getEnroledDevs().add(this);
	}

	public void progressing() {
		Optional<Content> first = this.enroledContents
			.stream()
			.findFirst();

		if(first.isPresent()) {
			this.finishedContents.add(first.get());
			this.enroledContents.remove(first.get());
		} else {
			String err = "[ERR] You're not enroled in any course.";
			System.err.println(err);
		}
	}

	public double calculateXP() {
		return this.finishedContents
			.stream()
			.mapToDouble(Content::calculateXP)
			.sum();
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

	public Set<Content> getEnroledContents() {
		return enroledContents;
	}

	public Set<Content> getFinishedContents() {
		return finishedContents;
	}

	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null || getClass() != o.getClass()) return false;
		Dev dev = (Dev) o;
		return Objects.equals(taxId, dev.taxId) && Objects.equals(birthday, dev.birthday) && Objects.equals(name, dev.name) && Objects.equals(finishedContents, dev.finishedContents) && Objects.equals(enroledContents, dev.enroledContents);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, enroledContents, finishedContents);
	}

	@Override
	public String toString() {
		return "Dev@"+this.name+"(" + this.age() + ")";
	}
}
