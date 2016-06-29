package l04navigation;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class PracticeL04CommandButtonController {

	@Inject
	PracticeL04CommandButtonBean bean;

    public String gotoPage(){

    	if("user".equals(bean.getId()) && "password".equals(bean.getPassword())){
            return("pl04commandbuttonnext");
    	}
    	return("pl04commandbuttonerrorpage");
    }

    public String gotoTop(){
    	return("pl04commandbuttontop");
    }
}