package l01output;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named
@RequestScoped
public class PracticeL01Javabean2Facelets {

    public String getHelloStr() {
        return "Hello ";
    }
    public String getJavaStr() {
        return "Java ";
    }
    public String getBeanStr() {
        return "Bean!";
    }
}