package l04scope;

import javax.enterprise.context.Conversation;
import javax.enterprise.context.ConversationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@ConversationScoped
public class L04ConversationScopedBean extends L04ScopedBaseBean {

	private static final long serialVersionUID = 4386726676450777293L;

	@Inject
	private Conversation con;

	public void start() {
		if(con.isTransient()){
			con.begin();
		}
	}
	
	public void end() {
		con.end();
	}

    public boolean isState() {
        return con.isTransient();
    }
}

