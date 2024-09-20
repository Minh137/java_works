package net.minh137.mybatis.dao;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.minh137.mybatis.dto.MemberDto;
import net.minh137.mybatis.mapper.MemberMapper;

@Service
public class MemDaoImpl implements MemDao {
   
	@Autowired
	private MemberMapper memberMapper;
	
	@Override
	public List<MemberDto> getAllMembers() {
		return memberMapper.listMem();
	}

	@Override
	public MemberDto getMember(int num) {
		return memberMapper.selectMem(num);
	}

	@Override
	public void createMember(MemberDto dto) {
       memberMapper.insertMem(dto);
	}

	@Override
	public void updateMember(MemberDto dto) {
       memberMapper.updateMem(dto);		
	}

	@Override
	public void delMember(int num) {
       memberMapper.deleteMem(num);
	}

}


