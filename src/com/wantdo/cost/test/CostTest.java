package com.wantdo.cost.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wantdo.cost.utils.CostCalcUtil;

public class CostTest {

	@Test
	public void test() {
		CostCalcUtil calcUtil=new CostCalcUtil();
		double cost=calcUtil.getCostByProno("’„Ω≠", 3.0);
		System.out.println(cost);
	}

}
