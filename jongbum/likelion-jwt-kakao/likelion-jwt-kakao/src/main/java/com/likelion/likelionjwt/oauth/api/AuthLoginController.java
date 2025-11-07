package com.likelion.likelionjwt.oauth.api;

import com.likelion.likelionjwt.oauth.application.AuthLoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/login/oauth2")
public class AuthLoginController {

    private final AuthLoginService authLoginService;

    @GetMapping("/code/kakao")
    public void kakaoCallback(@RequestParam(name = "code") String code) {
        authLoginService.kakaoLoginOrSignUp(code);
    }
}
