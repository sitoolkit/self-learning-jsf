package l04scope;

import java.io.Serializable;
import javax.faces.flow.FlowScoped;
import javax.inject.Named;

@Named
@FlowScoped("regFlow")
public class L04AccountRegBean implements Serializable{
    
	private static final long serialVersionUID = -2281891306252021298L;

	private String user;
	private String password;
	
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
    
    public void startAccountRegistration(){
        System.out.println("ユーザー登録フローの開始");
    }
    
    public void endAccountRegistration(){
        System.out.println("ユーザー登録フローの終了");
    }    
}
