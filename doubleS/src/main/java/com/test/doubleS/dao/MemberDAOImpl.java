package com.test.doubleS.dao;

import java.util.List;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.test.doubleS.vo.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO{

	@Inject
	SqlSessionTemplate sql;
	
	@Override
	public List<MemberVO> memberList() {
		// TODO Auto-generated method stub
		return sql.selectList("member.memberList");
	}

	@Override
	public void insertMember(MemberVO vo) {
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
