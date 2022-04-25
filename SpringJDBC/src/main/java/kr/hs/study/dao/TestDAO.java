package kr.hs.study.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.beans.TestBean;

@Component
public class TestDAO {
	// jdbc template�� �ڵ�����, ���� ������ �˷��ش�.
	@Autowired
	private JdbcTemplate db; 
	
	
	//���� ���� �ۼ�
	
	
	//1. insert
	public void insert_data(TestBean bean) { // �ڵ����� TestBean�� �ּҰ��� �����Ѵ�
		// container�� �ִ� TestBean�� ��ü�� bean�� �ڵ����Եȴ�.
		String sql = "insert into test values(?,?)";
		db.update(sql, bean.getData1(), bean.getData2());
	}
}
