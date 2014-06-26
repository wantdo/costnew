package com.wantdo.cost.test;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.wantdo.cost.dao.IPronameDAO;
import com.wantdo.cost.dao.IStoDAO;
import com.wantdo.cost.dao.ITracenoDAO;
import com.wantdo.cost.dao.IWspOrdermstDAO;
import com.wantdo.cost.model.Proname;
import com.wantdo.cost.model.Province;
import com.wantdo.cost.model.Sto;
import com.wantdo.cost.model.Traceno;
import com.wantdo.cost.model.WspOrdermst;
import com.wantdo.cost.utils.CostCalcUtil;

public class DaoTest {

	@Test
	public void testTraceno() {
		XmlBeanFactory factory=new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		IWspOrdermstDAO dao=(IWspOrdermstDAO)factory.getBean("WspOrdermstDAO");
		List<Object[]> list=dao.findByTraceno("668659725578");
		WspOrdermst wspOrdermst=(WspOrdermst)list.get(0)[0];
		Province province=(Province)list.get(0)[3];
		System.out.println(province.getPrvcname());
		System.out.println(wspOrdermst.getMemberid());
		CostCalcUtil costCalcUtil=new CostCalcUtil();
		Double cost=costCalcUtil.getCostByProno(province.getPrvcname());
		System.out.println(cost);
	}
	
	@Test
	public void testShopStat(){
		XmlBeanFactory factory=new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		IWspOrdermstDAO dao=(IWspOrdermstDAO)factory.getBean("WspOrdermstDAO");
		List<Object[]> list=dao.findShopStat();
		System.out.println(list.get(0)[2]);
	}
	
	@Test
	public void testProname(){
		XmlBeanFactory factory=new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		IPronameDAO dao=(IPronameDAO)factory.getBean("PronameDAO");
		List<Proname> list=dao.findAll();
		System.out.println(list.size());
	}
	
	@Test
	public void testSto(){
		XmlBeanFactory factory=new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		IStoDAO dao=(IStoDAO)factory.getBean("StoDAO");
		List<Sto> list=dao.findAll();
		System.out.println(list.size());
	}
	
	@Test
	public void testDelete(){
		XmlBeanFactory factory=new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		ITracenoDAO dao=(ITracenoDAO)factory.getBean("TracenoDAO");
		dao.deleteTableData();
	}
	
}