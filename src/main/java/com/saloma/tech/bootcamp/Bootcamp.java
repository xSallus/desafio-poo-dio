package com.saloma.tech.bootcamp;

import java.lang.Object;
import java.util.Objects;

import java.time.LocalDate;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Bootcamp {
	private String title;
	private String description;

	private final LocalDate startDate = LocalDate.now();
	private final LocalDate endDate = startDate.plusDays(45);

	private Set<Dev> enroledDevs = new HashSet<Dev>();
	private Set<Content> contents = new LinkedHashSet<Content>();

	public Bootcamp(String title, String description) {
		this.description = description;
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public Set<Content> getContents() {
		return contents;
	}

	public Set<Dev> getEnroledDevs() {
		return enroledDevs;
	}

	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null || getClass() != o.getClass()) return false;
		Bootcamp bc = (Bootcamp) o;
		return Objects.equals(title, bc.title) && Objects.equals(description, bc.description) && Objects.equals(endDate, bc.endDate) && Objects.equals(startDate, bc.startDate) && Objects.equals(contents, bc.contents) && Objects.equals(enroledDevs, bc.enroledDevs);
	}

	@Override
	public int hashCode() {
		return Objects.hash(title, description, startDate, endDate, enroledDevs, contents);
	}
}
