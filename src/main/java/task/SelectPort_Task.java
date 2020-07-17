package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static org.openqa.selenium.Keys.ENTER;
import static user_interface.ShoreExcursionPage.*;

public class SelectPort_Task implements Task {

    private String port_from_task;

    public SelectPort_Task(String port_from_feature) {
        this.port_from_task = port_from_feature;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PORT_DROPDOWN));
        actor.attemptsTo(Enter.theValue(port_from_task).into(PORT_DROPDOWN_TEXTFEILD).thenHit(ENTER));
        actor.attemptsTo(Click.on(FIND_EXCURSION_BUTTON));


        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }


    public static SelectPort_Task chooseport(String port_from_feature) {
        return Tasks.instrumented(SelectPort_Task.class, port_from_feature);
    }

}
