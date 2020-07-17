package user_interface;

import net.serenitybdd.screenplay.targets.Target;

public class ShoreExcursionPage {

    //THIS IS THE LINK TO SELECT THE SHORE_EXCURSION DROP DOWN
    public static final Target DESTINATION_DROPDOWN = Target.the("DESTINATION_DROPDOWN_TAG").
            locatedBy("//span[text()='Destination']");

    //THIS IS THE LINK TO SELECT THE PORT DROP DOWN
    public static final Target PORT_DROPDOWN = Target.the("PORT_DROPDOWN_TAG").
            locatedBy("//span[text()='Port']");

    //THIS IS THE TEXT FIELD TO INSERT THE DESTINATION
    public static final Target DESTINATION_DROPDOWN_TEXTFEILD = Target.the("DESTINATION_DROPDOWN_TEXTFEILD_TAG").
            locatedBy("(//div[@class='chosen-drop']/div/input)[1]");

    //THIS IS THE TEXT FIELD TO INSERT THE PORT NAME
    public static final Target PORT_DROPDOWN_TEXTFEILD = Target.the("PORT_DROPDOWN_TEXTFEILD_TAG").
            locatedBy("(//div[@class='chosen-drop']/div/input)[2]");


    //THIS IS THE BUTTON TO FIND EXCURSIONS
    public static final Target FIND_EXCURSION_BUTTON = Target.the("FIND_EXCURSION_BUTTON_TAG").
            locatedBy("//button[text()='FIND EXCURSIONS']");


}

