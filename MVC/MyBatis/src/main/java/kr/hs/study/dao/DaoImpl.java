package kr.hs.study.dao;


import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.hs.study.model.Databean;

@Repository
public class DaoImpl implements DaoInterface{

	@Autowired
	private SqlSessionTemplate sqlSession; // ������ ��� �����ؼ� mapper.xml�� �ִ� ���� ������ ��
	
	public void insert(Databean dto) {
		sqlSession.insert("test.insert_data", dto); // mapper�� �ִ� ���� insert�ض�
		
	}
	
	public List<Databean> select() {
		return sqlSession.selectList("test.select_data");
		
	}
	
}
