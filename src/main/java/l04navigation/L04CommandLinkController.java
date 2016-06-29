package l04navigation;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class L04CommandLinkController {

    public String gotoPage(){
        return("l04commandlinknext");
    }
}