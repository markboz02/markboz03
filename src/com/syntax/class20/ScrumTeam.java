package com.syntax.class20;

public class ScrumTeam extends Employee {
	
	String ceremonies;
	
	void attendMeetings() {
		System.out.println("Scrum team attend " + ceremonies);
	}

}

class ProductOwner extends ScrumTeam{
	void prioritizeBacklog() {
		System.out.println("PO prioritize product backlog");
	}
}

class ScrumMaster extends ScrumTeam {
	void nevigateTeam() {
		System.out.println();
	}
	
}