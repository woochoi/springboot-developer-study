package com.example.springbootdeveloper.service;

import com.example.springbootdeveloper.domain.Member;
import com.example.springbootdeveloper.repository.MemberRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// https://backendcode.tistory.com/209

@Service
@RequiredArgsConstructor // 초기화 되지않은 final 이나 @NonNull 으로 선언된 필드만을 파라미터로 받는 생성자를 생성
                         // @Autowired 를 사용하지 않고 의존성 주입 (Dependency Injection)
                         // 어떠한 빈(Bean)에 생성자가 오직 하나만 있고,
                         // 생성자의 파라미터 타입이 빈으로 등록 가능한 존재라면 이 빈은 @Autowired 어노테이션 없이도 의존성 주입이 가능하다.
public class TestService {

    private final MemberRepository memberRepository;

    //public TestService(MemberRepository memberRepository) {
    //    this.memberRepository = memberRepository;
    //}

    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }
}
