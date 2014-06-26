package com.wantdo.cost.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ActionInvocation;
import com.wantdo.cost.model.Person;
import com.wantdo.cost.model.Proname;
import com.wantdo.cost.service.IPersonService;
import com.wantdo.cost.service.IPronameService;


public class LoginAction extends ActionSupport{
	
	private final Log logger=LogFactory.getLog(getClass());
	
	private IPersonService personService;
	private Person person;
	private IPronameService pronameService;
	private List<Proname> proList;
	
	public LoginAction() {
		super();
		proList=new ArrayList<Proname>();
		person = new Person();
	}
	@Override
	public String execute() throws Exception {
		/*logger.info("Person [username="+person.getUsername()+
				",password="+person.getPassword()+"]");*/
		//System.out.println("------------------->LoginAction");
		//System.out.println(ServletActionContext.getRequest().getSession().getAttribute("username"));
		if(ServletActionContext.getRequest().getSession().getAttribute("username") != null){
			proList=pronameService.findAll();
			return SUCCESS;
		}
		if (personService.checkLogin(person)) {
			proList=pronameService.findAll();
			/*HttpServletRequest request=ServletActionContext.getRequest();
	        HttpSession session =request.getSession();
	        session.setAttribute("username", person.getUsername());*/
			ServletActionContext.getRequest().getSession().setAttribute("username", person.getUsername());
			//System.out.println("----------------->–¥»Îsession ");
			person = new Person();
			//ActionContext.getContext().getSession().put("username", person.getUsername());
			//System.out.println("----------------->–¥»Îsession "+ActionContext.getContext().getSession().get("username"));
			return SUCCESS;
		}
		return "login";
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public IPersonService getPersonService() {
		return personService;
	}

	public void setPersonService(IPersonService personService) {
		this.personService = personService;
	}

	public List<Proname> getProList() {
		return proList;
	}

	public void setProList(List<Proname> proList) {
		this.proList = proList;
	}
	public IPronameService getPronameService() {
		return pronameService;
	}
	public void setPronameService(IPronameService pronameService) {
		this.pronameService = pronameService;
	}

	

}
