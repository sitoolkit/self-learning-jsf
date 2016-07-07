package l04scope;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class L04SessionScopedBean implements Serializable {

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
