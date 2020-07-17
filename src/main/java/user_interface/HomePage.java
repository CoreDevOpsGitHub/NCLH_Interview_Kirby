package user_interface;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    //THIS IS THE HOMEPAGE URL
    public static final String URL = "https://www.ncl.com/";

    //THIS IS THE LINK TO SELECT THE SHORE_EXCURSION
    public static final Target SHORE_EXCURSION_LINK = Target.the("Shore_Excursion_Link_Tag").
            locatedBy("//a[@title='Explore Shore Excursions -Title']");
}

