package l04scope;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.faces.flow.FlowScoped;
import javax.inject.Named;

@Named
@FlowScoped("questionFlow")
public class L04QuestionRegBean implements Serializable {

    private static final long serialVersionUID = -5129379990275277050L;

    private String user;
    private Map<String, String> question;
    private String select = "";
    private String answer = "";

    public Map<String, String> getQuestion() {
        return question;
    }

    public void setQuestion(Map<String, String> question) {
        this.question = question;
    }

    public String getSelect() {
        return select;
    }

    public void setSelect(String select) {
        this.select = select;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void startQuestion() {
        System.out.println("質問登録フローの開始");

        question = new HashMap<>();
        question.put("出身地は？", "question1");
        question.put("好きな映画は？", "question2");
        question.put("好きな食べ物は", "question3");
    }

    public void endQuestion() {
        System.out.println("質問登録フローの終了");
    }

}