package l01output;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named
@RequestScoped
public class L01Javabean2Facelets {

    public String getValue() {
        return "Hello Java Bean!";
    }
}