package l04scope;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class L04ViewScopedBean {

	private int count;
	
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void countUp(){
        count++;
    }	
}
