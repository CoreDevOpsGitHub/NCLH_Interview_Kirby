package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;


public class OpenSite_Task implements Task {

    private String url;

    public OpenSite_Task(String url) {
        this.url = url;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(url));

    }

    public static OpenSite_Task to(String url) {

        return Tasks.instrumented(OpenSite_Task.class, url);
    }


}
