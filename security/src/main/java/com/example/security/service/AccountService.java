package com.example.security.service;

import com.example.security.dao.MemberRepository;
import com.example.security.entity.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    private MemberRepository memberRepository;

    public Member createMember(Member member) {
        return memberRepository.save(member);
    }

    public Member getMemberByEmail(String email) {
        return memberRepository.findByEmail(email);
    }

    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }

    public void deleteMember(Long memberId) {
        memberRepository.deleteById(memberId);
    }
}

