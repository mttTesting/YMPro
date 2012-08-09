package com.example.tests;

public class GroupDataEx {
	public String town;
	public String pref;
	public String num;

	public GroupDataEx(String town, String pref, String num) {
		this.town = town;
		this.pref = pref;
		this.num = num;
	}

	@Override
	public String toString() {
		return "GroupDataEx [town=" + town + ", pref=" + pref + ", num=" + num
				+ "]";
	}
	
}