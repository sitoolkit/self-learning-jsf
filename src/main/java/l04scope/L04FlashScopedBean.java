package l04scope;

import java.util.Map;

import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

@Named
public class L04FlashScopedBean extends L04ScopedBaseBean {

    private static final long serialVersionUID = 9193259872416512500L;

    private static final String redirectQuery = "?faces-redirect=true";

    @Inject
    L04RequestScopedBean request;

    public String transition() {

        request.countUp();
        super.countUp();
        FacesContext.getCurrentInstance().getExternalContext().getFlash().put("Key", this);

        Map<String, String> reqestParam = FacesContext.getCurrentInstance().getExternalContext()
                .getRequestParameterMap();
        if (reqestParam.get("redirect") == null) {
            return "l04flashscoped.xhtml";
        }
        return "l04flashscoped.xhtml" + redirectQuery;
    }
}