package l04scope;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;
import javax.faces.flow.Flow;
import javax.faces.flow.builder.FlowBuilder;
import javax.faces.flow.builder.FlowBuilderParameter;
import javax.faces.flow.builder.FlowDefinition;
import javax.inject.Named;

@Named
@Dependent
public class L04QuestionRegFlowDefinition {
    
	private final String flowId = "questionFlow";

	public String getFlowId() {
		return flowId;
	}

	@Produces
    @FlowDefinition
    public Flow defineFlow(@FlowBuilderParameter FlowBuilder flowBuilder){
        
        flowBuilder.initializer("#{l04QuestionRegBean.startQuestion()}");
        flowBuilder.finalizer("#{l04QuestionRegBean.endQuestion()}");
        flowBuilder.id("", flowId);
        flowBuilder.inboundParameter("user", "#{l04QuestionRegBean.user}");
        flowBuilder.viewNode(flowId, "/pages/l04scope/l04question.xhtml").markAsStartNode();
        flowBuilder.viewNode("regSecond", "/pages/l04scope/l04regsecond.xhtml");

        return flowBuilder.getFlow();
	}
}
