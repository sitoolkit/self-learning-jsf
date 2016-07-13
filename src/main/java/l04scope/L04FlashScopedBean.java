package l04scope;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.context.Flash;
import javax.inject.Named;

@Named
@RequestScoped
public class L04FlashScopedBean implements Serializable {

	private int count;
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	Flash flash = FacesContext.getCurrentInstance().getExternalContext().getFlash();
	
    public String redirect(){
    	count++;
    	flash.put("Key", this);
    	return "l04flashscoped.xhtml?faces-redirect=true";        
    }    
}