package com.spring.odi.query.common.bean.defaultValue;



import com.spring.odi.query.common.annotation.QueryConditionValue;
import com.spring.odi.query.common.bean.QueryBean;
import com.spring.odi.query.common.bean.TestInitBean;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
@QueryConditionValue(isStartInit = false,returnType = TestInitBean.class,name = "currentUser")
@Component
public class UserConditionValue extends AbstractConditionValue<TestInitBean, QueryBean>{

	public UserConditionValue() {
	}
	
	@Override
	Object getObject() {
		TestInitBean user = new TestInitBean();
		user.setUsername("test");
		user.setDate(LocalDate.now());
		return user;
	}

	@Override
	String getShortName() {
		return "currentUser";
	}

}
