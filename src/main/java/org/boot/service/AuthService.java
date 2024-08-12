package org.boot.service;

import org.boot.dto.ResponseDTO;
import org.boot.dto.SignUpDTO;
import org.boot.entity.UserEntity;
import org.boot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    UserRepository userRepository;

    public ResponseDTO<?> signUp(SignUpDTO dto){
       /* *existsById 메서드는 주어진 ID에 해당하는 엔티티가 데이터베이스에 존재하는지 여부를 확인하는 데 사용됩니다. 이 메서드는 데이터베이스에서 엔티티를 실제로 가져오지 않고, 주어진 ID가 데이터베이스에 존재하는지만 확인합니다. 따라서 존재 여부만 확인하고 데이터를 가져오지 않기 때문에 효율적입니다.
        *JpaRepository는 Spring Data JPA의 핵심 인터페이스 중 하나이며, 엔티티의 CRUD(Create, Read, Update, Delete) 작업을 처리하는 메서드를 제공합니다. existsById는 JpaRepository에서 제공하는 메서드 중 하나로, 데이터베이스에 엔티티가 존재하는지 여부를 확인하는 데 사용됩니다.
        *일반적으로 JpaRepository를 상속받은 인터페이스를 사용하여 엔티티에 대한 데이터베이스 작업을 수행합니다. JpaRepository를 구현한 인터페이스를 사용하면 기본적인 CRUD 작업 외에도 다양한 데이터베이스 관련 메서드를 사용할 수 있습니다. existsById 메서드도 그러한 메서드 중 하나입니다.*/

        String email = dto.getEmail();
        String password = dto.getPassword();
        String confirmPassword = dto.getConfirmPassword();

        // email(id) 중복 확인
        try {
            // 존재하는 경우 : true / 존재하지 않는 경우 : false
            if(userRepository.existsById(email)) {
                return ResponseDTO.setFailed("중복된 Email 입니다.");
            }
        } catch (Exception e) {
            return ResponseDTO.setFailed("데이터베이스 연결에 실패하였습니다.");
        }

        // password 중복 확인
        if(!password.equals(confirmPassword)) {
            return ResponseDTO.setFailed("비밀번호가 일치하지 않습니다.");
        }

        // UserEntity 생성
        UserEntity userEntity = new UserEntity(dto);

        // UserRepository를 이용하여 DB에 Entity 저장 (데이터 적재)
        try {
            userRepository.save(userEntity);
        } catch (Exception e) {
            return ResponseDTO.setFailed("데이터베이스 연결에 실패하였습니다.");
        }

        return ResponseDTO.setSuccess("회원 생성에 성공했습니다.");
    }

}
