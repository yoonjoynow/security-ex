package io.security.core.demo.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @GetMapping(value ="/mypage")
    public String myPage() throws Exception {
        return "user/login/home";
    }

    @GetMapping(value="/users")
    public String createUser() throws Exception {

        return "user/login/register";
    }
}