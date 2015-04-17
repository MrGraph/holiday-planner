package controllers;

import java.util.ArrayList;

import models.Vacation;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.formdata.VacationFormData;
import views.html.*;
//import views.html.planner;
//import views.html.vacations;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Holiday Planner"));
    }
    
    public static Result vacations() {
    	return ok(vacations.render());
    }

    public static Result planner() {
    	Form<VacationFormData> formData = Form.form(VacationFormData.class).bindFromRequest();
    	return ok(planner.render(formData));
    }
    
    public static Result postPlanner() {
    	Form<VacationFormData> vacationForm = Form.form(VacationFormData.class);
    	Form<VacationFormData> boundForm = vacationForm.bindFromRequest();
    	
    	VacationFormData data = boundForm.get();
    	
    	
    	ArrayList<Vacation> vacation_list = new ArrayList<Vacation>();
    	//TODO Check for specific keywords, etc, to redirect to the top recommended vacation
    	//for the user.
    	if (data.location.equals("Hawaii")){
    		ArrayList<String> keywords1 = new ArrayList<String>();
    		keywords1.add("Beach"); keywords1.add("relaxing");
    		vacation_list.add(new Vacation("Hawaii", "05-22-2015", "05-31-2015", "$2000", keywords1));
    	}
    	
    	
    	return ok(suggestions.render(vacation_list));
    }
}
