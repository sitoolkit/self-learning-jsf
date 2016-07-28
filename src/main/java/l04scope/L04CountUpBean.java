package l04scope;

import java.io.Serializable;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class L04CountUpBean implements Serializable {

    private static final long serialVersionUID = 5468350040856203289L;

    @Inject
    L04ApplicationScopedBean application;

    @Inject
    L04SessionScopedBean session;

    @Inject
    L04RequestScopedBean request;

    @Inject
    L04ViewScopedBean view;

    public void countUp() {
        application.countUp();
        session.countUp();
        request.countUp();
        view.countUp();
    }
}