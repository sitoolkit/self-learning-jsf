package l04scope;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class L04ScopedBean extends L04ScopedBaseBean{

	private static final long serialVersionUID = 5468350040856203289L;

	@Inject
	L04ApplicationScopedBean application; 
	
	@Inject
	L04SessionScopedBean session;
	
	@Inject
	L04RequestScopedBean request;
	
	@Inject
	L04ViewScopedBean view;

	@Override
    public void countUp(){
    	application.setCount(application.getCount()+1);
    	session.setCount(session.getCount()+1);
    	request.setCount(request.getCount()+1);
    	view.setCount(view.getCount()+1);
    }
}