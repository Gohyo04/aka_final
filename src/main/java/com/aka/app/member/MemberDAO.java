package com.aka.app.member;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberDAO {
	
	public MemberVO getDetail(MemberVO memberVO) throws Exception;
}
