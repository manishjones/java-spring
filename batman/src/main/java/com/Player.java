package com;

public class Player {
	public String name;
	public String country;
	public String club;

	public Player(String name, String country, String club) {
		this.name = name;
		this.country = country;
		this.club = club;
	}

	public Player() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}
	

}
