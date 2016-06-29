package l04navigation;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class L04CommandButtonController {

    public String gotoPage(){
        return("l04commandbuttonnext");
    }
}