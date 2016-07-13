package l04scope;

import java.io.Serializable;

import javax.enterprise.context.Conversation;
import javax.enterprise.context.ConversationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@ConversationScoped
public class L04ConversationScopedBean implements Serializable {

	private int count;

	@Inject
	private Conversation con;

	public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void countUp(){
        count++;
    }

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
