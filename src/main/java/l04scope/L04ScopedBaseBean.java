package l04scope;

import java.io.Serializable;

abstract class L04ScopedBaseBean implements Serializable{

	private static final long serialVersionUID = -1804590933439121876L;
    
	private int count;
	
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void countUp(){
    }
}
