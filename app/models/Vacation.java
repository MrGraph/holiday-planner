package models;

import java.util.ArrayList;

public class Vacation {
	
	public String location;
	public String start_date;
	public String end_date;
	public String the_cost;
	public Integer rank;
	public ArrayList<String> keywords = new ArrayList<String>();
	
	public Vacation() {
		location = "";
		start_date = "";
		end_date = "";
		the_cost = "";
		rank = 0;
	}
	
	public Vacation(String location, String start_date, String end_date, String the_cost,
					Integer rank, ArrayList<String> keywords){
		this.location = location;
		this.start_date = start_date;
		this.end_date = end_date;
		this.the_cost = the_cost;
		this.rank = rank;
		for (String key : keywords){
			//if (key == null) continue;
			this.keywords.add(key);
		}
	}
}