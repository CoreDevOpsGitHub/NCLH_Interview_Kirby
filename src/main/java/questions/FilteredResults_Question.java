
package questions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static user_interface.ResultsPage.QUANTITY_OF_ACTUAL_RESULTS;
import static user_interface.ResultsPage.QUANTITY_OF_UI_RESULTS;

public class FilteredResults_Question implements Question<Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {
        int INT_QUANTITY_OF_UI_RESULTS = Integer.parseInt(QUANTITY_OF_UI_RESULTS.resolveFor(actor).getText());
        String port_name = Serenity.sessionVariableCalled("port_name");


        System.out.println(QUANTITY_OF_UI_RESULTS.resolveFor(actor).getText());
        System.out.println(QUANTITY_OF_ACTUAL_RESULTS.of(port_name).resolveAllFor(actor).size());

        System.out.println(QUANTITY_OF_ACTUAL_RESULTS.of(port_name).resolveFor(actor).getText());


        if (QUANTITY_OF_ACTUAL_RESULTS.of(port_name).resolveAllFor(actor).size() == INT_QUANTITY_OF_UI_RESULTS) {
            return true;
        } else {
            return false;
        }


    }

    public static FilteredResults_Question equalToPort() {
        return new FilteredResults_Question();
    }
}


