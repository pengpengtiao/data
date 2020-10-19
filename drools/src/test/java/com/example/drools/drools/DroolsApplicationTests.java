package com.example.drools.drools;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.kie.api.KieBase;
import org.kie.api.cdi.KBase;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.core.AutoConfigureCache;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class DroolsApplicationTests {



	@Autowired
	private KieBase kieBase;//注入KieBase对象
	@Test
	public void test1(){
		KieSession kieSession = kieBase.newKieSession();
		kieSession.fireAllRules();
		kieSession.dispose();
	}
}
