package com.projectjj.quizuxui.dao;

import com.projectjj.quizuxui.vo.Member;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberDao {

    void deleteMemberByNo(int no);
    void insertMember(Member member);
    void updateMember(Member member);

}
