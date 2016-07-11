package l03navigation;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class PracticeL03CommandLinkController {

	@Inject
	PracticeL03CommandLinkBean bean;

    public String gotoPage(){

    	if("user".equals(bean.getId()) && "password".equals(bean.getPassword())){
            return "pl03commandlinknext";
    	}
    	return "pl03errorpage";
    }

    public String gotoTop(){
    	return "pl03commandlinktop";
    }
}