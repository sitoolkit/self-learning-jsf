package l04scope;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class L04RequestScopedBean extends L04ScopedBaseBean {

    private static final long serialVersionUID = 1739793461001721279L;
}
