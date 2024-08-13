package org.boot.repository;

import org.boot.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

//역할: 데이터베이스와의 상호 작용을 담당합니다. CRUD(Create, Read, Update, Delete) 작업을 수행할 메소드를 제공
//특징: Spring Data JPA를 이용하여 인터페이스를 정의하며, 해당 인터페이스를 상속받는 클래스는 기본적인 CRUD 메소드를 자동으로 구현
//@Repository
//@NoRepositoryBean
public interface UserRepository extends JpaRepository<UserEntity, String> {

}