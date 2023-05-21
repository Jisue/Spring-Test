package com.example.demotest.service;

import com.example.demotest.domain.Member;
import com.example.demotest.repository.MemberRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.assertj.core.api.Assertions;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
class MemberServiceTest {

    @InjectMocks
    private MemberService memberService;

    @Mock
    private MemberRepository memberRepository;

    @Test
    @DisplayName("회원 조회 결과 Member 리스트가 반환되어야 한다.")
    void findAllMember() {
        // given
        List<Member> memberList = new ArrayList<>();
        memberList.add(new Member(
                1L,
                "name1"));
        memberList.add(new Member(
                2L,
                "name2"));


        // when
        Mockito.when(memberRepository.findAll()).thenReturn(memberList);
        List<Member> result = memberService.findAllMember();

        // then
        Assertions.assertThat(result).hasSize(2);
        Assertions.assertThat(result.get(0).getName()).isEqualTo("name1");
        Assertions.assertThat(result.get(1).getName()).isEqualTo("name2");
    }
}