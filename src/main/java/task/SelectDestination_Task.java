package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static org.openqa.selenium.Keys.ENTER;
import static user_interface.ShoreExcursionPage.*;

public class SelectDestination_Task implements Task {

    private String destination_from_task;

    public SelectDestination_Task(String destination_from_feature) {
        this.destination_from_task = destination_from_feature;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(DESTINATION_DROPDOWN));
        actor.attemptsTo(Enter.theValue(destination_from_task).into(DESTINATION_DROPDOWN_TEXTFEILD).thenHit(ENTER));


    }


    public static SelectDestination_Task choosedestination(String destination_from_feature) {
        return Tasks.instrumented(SelectDestination_Task.class, destination_from_feature);
    }

}
