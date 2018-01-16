package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.dao.UserDAO;
import com.test.vo.User;

@Service
public class TestServiceImpl implements TestService {

	@Autowired UserDAO userDAO;
	/* ������̼� Ʈ����� ����
	//@Transactional(rollbackFor=Exception.class)
*/	@Override
	public void testTransaction() throws Exception {
		User user = new User();
		user.setName("ȫ�浿");
		user.setPwd("zxcv1234");
		for (int i = 5; i < 10; i++) {
			user.setId("users"+i);
			userDAO.insertUser(user);
			if(i == 7) {
				throw new Exception();
			}
		}
		user.setId("users5");
		userDAO.insertUser(user);
	}
}
