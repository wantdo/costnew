package com.wantdo.cost.test;

import org.apache.struts2.StrutsSpringTestCase;
import org.junit.Test;

import com.opensymphony.xwork2.ActionProxy;
import com.wantdo.cost.action.ExpEditAction;
import com.wantdo.cost.action.UploadAction;

public class ActionTest extends StrutsSpringTestCase{


	@Test
	public void testUploadAction() throws Exception {
		ActionProxy proxy=getActionProxy("UploadAction.action");
		UploadAction action=(UploadAction)proxy.getAction();
	}
	@Test
	public void testExpEditAction() throws Exception {
		ActionProxy proxy=getActionProxy("ExpEditAction.action");
		ExpEditAction action=(ExpEditAction)proxy.getAction();
	}

}
