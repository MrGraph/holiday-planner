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
    	return ok("cool");
    }
}
