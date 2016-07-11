package l03navigation;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class L03CommandLinkController {

    public String gotoPage(){
        return "l03commandlinknext";
    }
}