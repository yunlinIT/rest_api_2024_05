package com.koreait.rest_2024_05.member.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.koreait.rest_2024_05.base.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString(callSuper = true)
public class Member extends BaseEntity {

    @Column(unique = true)
    private String username;

    @JsonIgnore
    private String password;

    private String email;

    // 현재 회원이 가지고 있는 권한들을 List<GrantedAuthority> 형태로 리턴
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority("MEMBER"));

        return authorities;
    }
}
