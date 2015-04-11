package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Holiday Planner"));
    }
    
    public static Result vacations() {
    	return ok(vacations.render());
    }

    public static Result planner() {
    	return ok();
    }
}
