package l03navigation;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class PracticeL03CommandButtonController {

	@Inject
	PracticeL03CommandButtonBean bean;

    public String gotoPage(){

    	if("user".equals(bean.getId()) && "password".equals(bean.getPassword())){
            return "pl03commandbuttonnext";
    	}
    	return "pl03commandbuttonerrorpage";
    }

    public String gotoTop(){
    	return "pl03commandbuttontop";
    }
}