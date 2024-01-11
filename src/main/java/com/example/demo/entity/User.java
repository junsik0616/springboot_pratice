package com.example.demo.entity;

// lombok
import lombok.ToString; // toString() 생략
import lombok.Getter; // get 메소드 생성
import lombok.Builder; // builder 패턴 자동 생성
import lombok.AllArgsConstructor; // 모든 필드 값을 파라미터로 받는 생성자(id 제외)를 만듦
import lombok.NoArgsConstructor; // 파라미터가 없는 기본 생성자(id)를 생성
// jakarta
import jakarta.persistence.Table; // 테이블 지정
import jakarta.persistence.Entity; // 데이터베이스 테이블과 매핑되는 클래스
import jakarta.persistence.FetchType;
import jakarta.persistence.Id; // 엔터티의 기본 키를 지정
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapKey;
import jakarta.persistence.OneToMany;
import jakarta.persistence.GeneratedValue; // 기본 키 값에 대한 생성자 제공
import jakarta.persistence.GenerationType; // 기본 키 값에 대한 생성 타입

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column; // 열 지정

// 여행지 테이블
@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
@Entity
public class User {
    // 기본키 id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // MySQL의 AUTO_INCREMENT를 사용
    private Long id;

    // 아이디
    @Column(name = "user_id", nullable = false, length = 100)
    private String user_id;

    // 비밀번호
    @Column(name = "password", nullable = false, length = 100)
    private String password;

    // 이름
    @Column(name = "name", nullable = false, length = 100)
    private String name;

    // 생년월일
    @Column(name = "birth_date", nullable = false, length = 100)
    private String birth_date;

    // 휴대전화 번호
    @Column(name = "phone_num", nullable = false, length = 100)
    private String phone_num;

    
    public User(String user_id, String password, String name, String birth_date, String phone_num) {
        this.user_id = user_id;
        this.password = password;
        this.name = name; 
        this.birth_date = birth_date;
        this.phone_num = phone_num;
    }
}