package views.formdata;


import models.Vacation;

import java.util.ArrayList;
import java.util.List;


public class VacationFormData {
	
	public String location;
	public String start_date;
	public String end_date;
	public String max_price;
	//public ArrayList<String> keywords = new ArrayList<String>();
	public String keywords;
	
	public VacationFormData() {
		location = "";
		start_date = "";
		end_date = "";
		max_price = "";
		keywords = "";
	}
	
	public VacationFormData(String location, String start_date, String end_date, String max_price, String keywords){
		this.location = location;
		this.start_date = start_date;
		this.end_date = end_date;
		this.max_price = max_price;
		this.keywords = keywords;
	}
}