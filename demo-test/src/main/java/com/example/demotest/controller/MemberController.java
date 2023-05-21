package com.example.demotest.controller;

import com.example.demotest.domain.Member;
import com.example.demotest.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {

    private final MemberService memberService;
    @GetMapping("/list")
    public List<Member> members() {

        List<Member> findMembers = memberService.findAllMember();

        return findMembers;
    }
}
