package l03navigation;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class L03CommandButtonController {

    public String gotoPage(){
        return "l03commandbuttonnext";
    }
}