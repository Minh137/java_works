package net.minh137.mybatis.dao;

import java.util.List;

import net.minh137.mybatis.dto.MemberDto;

public interface MemDao {
	   List<MemberDto> getAllMembers();
	   MemberDto getMember(int num);
	   void createMember(MemberDto dto);
	   void updateMember(MemberDto dto);
	   void delMember(int num);
	}
