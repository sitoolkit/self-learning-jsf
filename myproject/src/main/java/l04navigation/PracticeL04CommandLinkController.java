package l04navigation;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class PracticeL04CommandLinkController {

    public String gotoNext(){
        return("pl04commandlinknext");
    }

    public String gotoAfterNext(){
	    return("pl04commandlinknext2");
	}
}