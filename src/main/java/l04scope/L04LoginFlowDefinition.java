package l04scope;

import java.io.Serializable;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;
import javax.faces.flow.Flow;
import javax.faces.flow.builder.FlowBuilder;
import javax.faces.flow.builder.FlowBuilderParameter;
import javax.faces.flow.builder.FlowDefinition;
import javax.inject.Named;

@Named
@Dependent
public class L04LoginFlowDefinition implements Serializable {

	private static final long serialVersionUID = 1845903692196876066L;

	private final String flowId = "loginFlow";

    public String getFlowId() {
		return flowId;
	}
	
    @Produces
    @FlowDefinition
    public Flow defineFlow(@FlowBuilderParameter FlowBuilder flowBuilder){

    	//idをset
    	flowBuilder.id("", flowId);
        //トップへ戻るノード
        flowBuilder.returnNode("top").fromOutcome("l04logintop");
        //1ぺージ目画面（ここからフロースタート）
    	flowBuilder.viewNode(flowId, "/pages/l04scope/l04logininput.xhtml").markAsStartNode();
    	//結果表示画面
    	flowBuilder.viewNode("finish", "/pages/l04scope/l04loginfinish.xhtml");
    	//エラーぺージ
    	flowBuilder.viewNode("error", "/pages/l04scope/l04loginerror.xhtml");

    	//checkメソッド呼び出し
        flowBuilder.methodCallNode("login").expression("#{l04FlowScopedBean.login()}");

    	return flowBuilder.getFlow();
    }
}