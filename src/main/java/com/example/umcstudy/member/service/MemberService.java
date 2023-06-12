package com.example.umcstudy.member.service;

import com.example.umcstudy.exception.BusinessLogicException;
import com.example.umcstudy.exception.ExceptionCode;
import com.example.umcstudy.member.entity.MemberEntity;
import com.example.umcstudy.member.repository.MemberRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    //Create
    public MemberEntity craeteMember(MemberEntity member) {
        return memberRepository.save(member);
    }

    // Read
    public MemberEntity findMember(long memberId) {
        MemberEntity member = verifiedMember(memberId);
        return member;
    }

    // Update
    public MemberEntity patchMember(MemberEntity member) {
        MemberEntity findMember = verifiedMember(member.getMemberId());
        Optional.ofNullable(member.getName()).ifPresent(findMember::setName);
        Optional.ofNullable(member.getEmail()).ifPresent(findMember::setEmail);
        Optional.ofNullable(member.getPay()).ifPresent(findMember::setPay);
        Optional.ofNullable(member.getTemperature()).ifPresent(findMember::setTemperature);
        Optional.ofNullable(member.getImage()).ifPresent(findMember::setImage);

        return memberRepository.save(findMember);
    }

    public MemberEntity putMember(MemberEntity member) {
        MemberEntity findMember = verifiedMember(member.getMemberId());
        findMember.setEmail(member.getEmail());
        findMember.setName(member.getName());
        findMember.setPay(member.getPay());
        findMember.setTemperature(member.getTemperature());
        findMember.setImage(member.getImage());

        return memberRepository.save(findMember);
    }

    // Delete
    public void deleteMember(long memberId) {
        MemberEntity member = verifiedMember(memberId);
        memberRepository.delete(member);
    }

    // 멤버 검증
    public MemberEntity verifiedMember(long memberId) {
        Optional<MemberEntity> member = memberRepository.findById(memberId);
        return member.orElseThrow(() -> new BusinessLogicException(ExceptionCode.MEMBER_NOT_FOUND));
    }
}
