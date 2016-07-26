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
public class L04AccountRegFlowDefinition {
    
	private final String flowId = "regFlow";

	public String getFlowId() {
		return flowId;
	}

	@Produces
    @FlowDefinition
    public Flow defineFlow(@FlowBuilderParameter FlowBuilder flowBuilder){
        
        flowBuilder.initializer("#{l04AccountRegBean.startAccountRegistration()}");
        flowBuilder.finalizer("#{l04AccountRegBean.endAccountRegistration()}");
        
        flowBuilder.id("", flowId);
        flowBuilder.returnNode("index").fromOutcome("/pages/l04scope/l04index.xhtml");
        flowBuilder.viewNode(flowId, "/pages/l04scope/l04regfirst.xhtml").markAsStartNode();
        flowBuilder.viewNode("confirm", "/pages/l04scope/l04regsecond.xhtml");
        flowBuilder.flowCallNode("question")
                .flowReference("", "questionFlow")
                .outboundParameter("user", "#{l04AccountRegBean.user}");

        return flowBuilder.getFlow();
    }
}
