package com.example.springbootdeveloper.domain;


import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor // 모든 필드 값을 파라미터로 받는 생성자를 생성
@NoArgsConstructor(access = AccessLevel.PROTECTED) // 파라미터가 없는 디폴트 생성자를 생성
// PUBLIC: 기본값이며, 모든 클래스에서 생성자에 접근 가능
// PROTECTED: 같은 패키지의 클래스와 상속받은 클래스에서 생성자에 접근 가능
// PACKAGE: 같은 패키지의 클래스에서 생성자에 접근 가능
// PRIVATE: 해당 클래스 내부에서만 생성자에 접근 가능

// @NoArgsConstructo 기본 생성자를 만들어줌

@Getter
@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;
}
