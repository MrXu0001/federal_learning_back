package com.federal.service;


import com.federal.VO.LoginForm;
import com.federal.utils.R;

public interface LoginService {

    R login(LoginForm loginForm);

    R logout();
}
