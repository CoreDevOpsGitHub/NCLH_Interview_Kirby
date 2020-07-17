package user_interface;

import net.serenitybdd.screenplay.targets.Target;

public class ResultsPage {
    public static final Target QUANTITY_OF_ACTUAL_RESULTS = Target.the("QUANTITY_OF_ACTUAL_RESULTS_TAG").
            locatedBy("//ul[@id='searchResults']//li//h3[text()='{0}']");

    public static final Target QUANTITY_OF_UI_RESULTS = Target.the("QUANTITY_OF_UI_RESULTS_TAG").
            locatedBy("//*[@id='sap-menu-left']//span[@class='column numb']");


}
