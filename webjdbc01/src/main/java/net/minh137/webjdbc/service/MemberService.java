package net.minh137.webjdbc.service;



import org.springframework.ui.Model;

import net.minh137.webjdbc.model.MemberDto;

public interface MemberService {
	   int insertMem(MemberDto dto);
	   void getMemByNum(int num, Model model);
	   void getAllMem(Model model);
	   int updateMem(MemberDto dto);
	   int delMem(int num);
	}

