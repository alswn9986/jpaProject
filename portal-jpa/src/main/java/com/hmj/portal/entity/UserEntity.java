package com.hmj.portal.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
@Builder			// 수정자(Setter)를 사용하지 않는 Builder(+Getter)패턴
@AllArgsConstructor	// 모든 필드 값을 파라미터로 받는 생성자
@NoArgsConstructor	// 파라미터가 없는 기본 생성자
@Table(name="user")	// 테이블명
@Entity(name="user")
public class UserEntity {
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(nullable = false, length = 30)
    private String id;
	
	@Column(nullable = false, length = 30)
    private String name;
}
