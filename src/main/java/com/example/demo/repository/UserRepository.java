package com.example.demo.repository;

import com.example.demo.entity.User;
// 간단히 DB에 Create/Read/Update/Delete 쿼리 수행을 가능토록 함
import org.springframework.data.jpa.repository.JpaRepository;
// 리스트
import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    @Override
    List<User> findAll(); // 조건없이 테이블의 전체 레코드 조회

    // boolean existsByuser_id(String user_id); // 유저 아이디로 유저 존재 여부 확인

    // User findByuser_id(String user_id); // 유저 아이디로 유저 조회

    List<User> findByname(String name);

    void deleteAllInBatch(); // 조건없이 테이블의 전체 레코드 삭제
}