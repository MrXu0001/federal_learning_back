package com.federal.VO;

import lombok.Data;

@Data
public class LoginForm {

    private String username;

    private String password;

    private String captcha;

    private String uuid;
}
