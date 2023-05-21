package com.example.demotest.service;

import com.example.demotest.domain.Member;
import com.example.demotest.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MemberService {

    private final MemberRepository memberRepository;

    public List<Member> findAllMember() {
        return memberRepository.findAll();
    }

}
