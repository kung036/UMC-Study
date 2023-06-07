package com.example.umcstudy.member.controller;

import com.example.umcstudy.member.dto.MemberDto;
import com.example.umcstudy.member.entity.MemberEntity;
import com.example.umcstudy.member.mapper.MemberMapper;
import com.example.umcstudy.member.service.MemberService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Positive;

@RestController
@RequestMapping("/member")
@Validated
@AllArgsConstructor
public class MemberController {
    private final MemberService memberService;
    private final MemberMapper memberMapper;

    // Create
    @PostMapping
    public ResponseEntity postMember(@Valid @RequestBody MemberDto.Post post) {
        MemberEntity member = memberService.craeteMember(memberMapper.memberDtoPostToMember(post));
        MemberDto.Response response = memberMapper.memberToMemberDtoResponse(member);

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    // Read
    @GetMapping
    public ResponseEntity getMember(@Positive @RequestParam long memberId) {
        MemberEntity member = memberService.findMember(memberId);
        MemberDto.Response response = memberMapper.memberToMemberDtoResponse(member);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    // Update
    @PatchMapping("/{member-id}")
    public ResponseEntity patchMember(@Positive @PathVariable("member-id") long memberId,
                                      @RequestBody MemberDto.Patch patch) {
        patch.setMemberId(memberId);
        MemberEntity member = memberService.patchMember(memberMapper.memberDtoPatchToMember(patch));
        MemberDto.Response response = memberMapper.memberToMemberDtoResponse(member);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PutMapping("/{member-id}")
    public ResponseEntity putMember(@Positive @PathVariable("member-id") long memberId,
                                    @Valid @RequestBody MemberDto.Put put) {
        put.setMemberId(memberId);
        MemberEntity member = memberService.putMember(memberMapper.memberDtoPutToMember(put));
        MemberDto.Response response = memberMapper.memberToMemberDtoResponse(member);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    // Delete
    @DeleteMapping("/{member-id}")
    public ResponseEntity deleteMember(@Positive @PathVariable("member-id") long memberId) {
        memberService.deleteMember(memberId);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
