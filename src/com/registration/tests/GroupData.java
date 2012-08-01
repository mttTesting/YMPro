package com.registration.tests;

public class GroupData {
	public String town;
	public String pref;
	public String num;

	public GroupData(String town, String pref, String num) {
		this.town = town;
		this.pref = pref;
		this.num = num;
	}

	@Override
	public String toString() {
		return "GroupData [town=" + town + ", pref=" + pref + ", num=" + num
				+ "]";
	}
	
}