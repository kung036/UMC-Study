package com.example.umcstudy.member.mapper;

import com.example.umcstudy.member.dto.MemberDto;
import com.example.umcstudy.member.entity.MemberEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MemberMapper {
    MemberDto.Response memberToMemberDtoResponse(MemberEntity member);
    MemberEntity memberDtoPostToMember(MemberDto.Post post);
    MemberEntity memberDtoPatchToMember(MemberDto.Patch patch);
}
