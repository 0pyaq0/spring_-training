package kr.hs.study.service;

import kr.hs.study.dto.memberDTO;

public interface memberInterface {
	//��� ����, ����, ����, �������� �޼��� �ۼ�
	public void insert(memberDTO dto);
	public void update(memberDTO dto);
	public void delete(memberDTO dto);
	public void select(memberDTO dto);
}
