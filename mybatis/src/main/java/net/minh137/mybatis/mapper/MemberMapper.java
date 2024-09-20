package net.minh137.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import net.minh137.mybatis.dto.MemberDto;

@Mapper
public interface MemberMapper {
	
	//selectMem, listMem, inserMem, updateMem, deleteMem
	List<MemberDto> listMem();
	MemberDto selectMem(int num);
	void insertMem(MemberDto dto);
	void updateMem(MemberDto dto);
	void deleteMem(int num);
	
}
