package com.koreait.rest_2024_05.boundedContext.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/member")
public class MemberController {

    @PostMapping("/login")
    public String login() {
        return "성공";
    }
}
