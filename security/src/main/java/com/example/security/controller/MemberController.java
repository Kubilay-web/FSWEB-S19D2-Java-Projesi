package com.example.security.controller;

import com.example.security.entity.Member;
import com.example.security.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/members")
public class MemberController {
    @Autowired
    private AccountService accountService;

    @PostMapping("/create")
    public Member createMember(@RequestBody Member member) {
        return accountService.createMember(member);
    }

    @GetMapping("/{email}")
    public Member getMemberByEmail(@PathVariable String email) {
        return accountService.getMemberByEmail(email);
    }

    @GetMapping("/all")
    public List<Member> getAllMembers() {
        return accountService.getAllMembers();
    }

    @DeleteMapping("/{memberId}")
    public void deleteMember(@PathVariable Long memberId) {
        accountService.deleteMember(memberId);
    }
}