package models;

import java.util.ArrayList;

public class Vacation {
	
	public String location;
	public String start_date;
	public String end_date;
	public String the_cost;
	public ArrayList<String> keywords = new ArrayList<String>();
	
	public Vacation() {}
	
	public Vacation(String location, String start_date, String end_date, String the_cost,
					ArrayList<String> keywords){
		this.location = location;
		this.start_date = start_date;
		this.end_date = end_date;
		this.the_cost = the_cost;
		for (String key : keywords){
			//if (key == null) continue;
			this.keywords.add(key);
		}
	}
}