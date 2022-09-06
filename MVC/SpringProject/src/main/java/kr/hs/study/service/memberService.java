package kr.hs.study.service;

import java.util.List;

import kr.hs.study.dto.memberDTO;

public interface memberService {
	//��� ����, ����, ����, �������� �޼��� �ۼ�
	public void insert(memberDTO dto);
	public List<memberDTO> selectAll();
	public void update(memberDTO dto) ;
	public memberDTO read(String userid);
	public void delete(String userid);

}
