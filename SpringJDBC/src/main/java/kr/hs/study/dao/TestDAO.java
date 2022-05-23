package kr.hs.study.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.beans.TestBean;

@Component
public class TestDAO {
	// jdbc template�� �ڵ�����, ���� ������ �˷��ش�.
	@Autowired
	private JdbcTemplate db; 
	
	@Autowired
	MapperClass mapperClass; 
	// container�� �ִ� MapperClass bean�� ã�Ƽ� mapper�� ����
	
	
	//���� ���� �ۼ�
	
	
	//1. insert
	public void insert_data(TestBean bean) { // �ڵ����� TestBean�� �ּҰ��� �����Ѵ�
		// container�� �ִ� TestBean�� ��ü�� bean�� �ڵ����Եȴ�.
		String sql = "insert into test values(?,?)";
		db.update(sql, bean.getData1(), bean.getData2());
	}
	

	// 2. update
	public void update_data(TestBean bean) {
		// TestBean bean = new TestBean(); 
		String sql = "update test set data2=? where data1=?";
		db.update(sql, bean.getData2(), bean.getData1());
	}
	
	// 3. delete
		public void delete_data(int data1) {
			// TestBean bean = new TestBean(); 
			String sql = "delete from test where data1=?";
			db.update(sql, data1);
		}
	
	// 4. select
	public List<TestBean> select_data() {
		String sql = "select * from test";
		List<TestBean> list = db.query(sql, mapperClass);
		return list;
	}
}
