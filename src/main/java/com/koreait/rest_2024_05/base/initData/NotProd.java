package com.koreait.rest_2024_05.base.initData;


import com.koreait.rest_2024_05.boundedContext.article.service.ArticleService;
import com.koreait.rest_2024_05.boundedContext.member.entity.Member;
import com.koreait.rest_2024_05.boundedContext.member.service.MemberService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@Profile({"dev", "test"})
public class NotProd {
    @Bean
    CommandLineRunner initData(MemberService memberService, ArticleService articleService, PasswordEncoder passwordEncoder) {
        String password = passwordEncoder.encode("1234");
        return args -> {
            Member admin = memberService.join("admin", password, "admin@test.com");
            Member member1 = memberService.join("user1", password, "user1@test.com");
            Member member2 = memberService.join("user2", password, "user2@test.com");

            articleService.write(admin, "제목 1", "내용 1");
            articleService.write(admin, "제목 2", "내용 2");
            articleService.write(admin, "제목 3", "내용 3");

            articleService.write(member1, "제목 4", "내용 4");
            articleService.write(member1, "제목 5", "내용 5");
            articleService.write(member1, "제목 6", "내용 6");

            articleService.write(member2, "제목 7", "내용 7");
            articleService.write(member2, "제목 8", "내용 8");
            articleService.write(member2, "제목 9", "내용 9");
        };
    }
}
