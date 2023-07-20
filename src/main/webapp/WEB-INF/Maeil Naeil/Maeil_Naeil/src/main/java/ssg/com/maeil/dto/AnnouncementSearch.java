package ssg.com.maeil.dto;

import java.io.Serializable;

public class AnnouncementSearch implements Serializable {
	
	private String choice;	
	private String search;	
	private int pageNumber;
	
	public AnnouncementSearch() {
		// TODO Auto-generated constructor stub
	}

	public AnnouncementSearch(String choice, String search, int pageNumber) {
		super();
		this.choice = choice;
		this.search = search;
		this.pageNumber = pageNumber;
	}

	public String getChoice() {
		return choice;
	}

	public void setChoice(String choice) {
		this.choice = choice;
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
}
