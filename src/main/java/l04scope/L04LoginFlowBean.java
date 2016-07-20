package l04scope;

import java.io.Serializable;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.faces.flow.FlowScoped;
import javax.inject.Named;

@Named
@FlowScoped("loginFlow")
public class L04LoginFlowBean implements Serializable {

	private static final long serialVersionUID = 5681934199344704949L;
	
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	private String user;
	private String password;
	
	public String login(){		
        Map<Object, Object> flowObject = FacesContext.getCurrentInstance().getApplication().getFlowHandler().getCurrentFlowScope();
        
    	if("user".equals(user) && "password".equals(flowObject.get("password"))){
            System.out.println("finish");
    		return "finish";
    	}
        System.out.println("error");
    	return "error";
	}	
}