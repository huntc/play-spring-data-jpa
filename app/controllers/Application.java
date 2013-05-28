package controllers;

import play.mvc.*;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

/**
 * The main set of web services.
 */
@Singleton
@Named
public class Application extends Controller {

    public Result index() {
        return ok(views.html.index.render("Some message"));
    }
}
