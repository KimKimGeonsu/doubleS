package com.test.doubleS.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.doubleS.dao.MemberDAO;
import com.test.doubleS.vo.MemberVO;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	MemberDAO dao;
	
	//회원목록
	@Override
	public List<MemberVO> memberList() {
		// TODO Auto-generated method stub
		return dao.memberList();
	}

	@Override
	public void inserMember(MemberVO vo) {
		// TODO Auto-generated method stub

	}

	@Override
	public MemberVO viewMember() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteMember(String userId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateMember(MemberVO vo) {
		// TODO Auto-generated method stub

	}

}
