package com.projectjj.quizuxui.restController;


import com.projectjj.quizuxui.dto.ResponseDto;
import com.projectjj.quizuxui.form.MemberRegisterForm;
import com.projectjj.quizuxui.vo.Member;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/member")
public class MemberRestController {


    @PostMapping("/register")
    public ResponseDto<String> register(@RequestBody MemberRegisterForm form){
        ResponseDto<String> res = new ResponseDto<>();
        Member member = new Member();
        BeanUtils.copyProperties(form, member);

        member.setPassword(member.getPassword());
        System.out.println("비밀번호 : "+ member.getPassword());


        return res;

    }
}
