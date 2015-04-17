package controllers;

import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.formdata.VacationFormData;
import views.html.index;
import views.html.planner;
import views.html.vacations;

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
    	
    	//TODO Check for specific keywords, etc, to redirect to the top recommended vacation
    	//for the user.
    	
    	return ok(data.location);
    }
}
