package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import user_interface.HomePage;

public class OpenShoreExcursionPage_Task implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomePage.SHORE_EXCURSION_LINK));
    }


    public static OpenShoreExcursionPage_Task goesTo() {
        return Tasks.instrumented(OpenShoreExcursionPage_Task.class);

    }
}


