package com.example.umcstudy.oauth2.handler;

import com.example.umcstudy.member.entity.MemberEntity;
import com.example.umcstudy.member.service.MemberService;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserLogoutSuccessHandler implements LogoutSuccessHandler {
    private final MemberService memberService;


    public UserLogoutSuccessHandler(MemberService memberService) {
        this.memberService = memberService;
    }

    @Override
    public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication)
        throws IOException, ServletException {
        System.out.println("!! success logout");
    }
}
