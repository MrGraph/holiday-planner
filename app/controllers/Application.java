package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

import views.formdata.*;

import play.data.Form;

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
    	return ok("cool");
    }
}
