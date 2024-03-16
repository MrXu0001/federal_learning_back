package com.federal.controller;

import com.federal.VO.LoginForm;
import com.federal.model.User;
import com.federal.service.CaptchaService;
import com.federal.service.LoginService;
import com.federal.service.UserService;
import com.federal.utils.JwtUtil;
import com.federal.utils.R;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;

@RestController
@RequestMapping("/User")
@CrossOrigin
public class LoginController {

    @Autowired
    private LoginService loginService;
    @Autowired
    private CaptchaService captchaService;
    @Autowired
    private UserService userService;
    /**
     * 验证码
     */
    @GetMapping("captcha.jpg")
    public void captcha(HttpServletResponse response, String uuid) throws IOException {
        response.setHeader("Cache-Control", "no-store, no-cache");
        response.setContentType("image/jpeg");
        //获取图片验证码
        BufferedImage image = captchaService.getCaptcha(uuid);
        ServletOutputStream out = response.getOutputStream();
        ImageIO.write(image, "jpg", out);
        IOUtils.closeQuietly(out);
    }

    /**
     * 登录
     */
    @PostMapping("/user/login")
    public R login(@RequestBody LoginForm loginForm) {
        boolean captcha = captchaService.validate(loginForm.getUuid(), loginForm.getCaptcha());
        System.out.println(captcha);
        if (!captcha) {
            return R.error("验证码不正确");
        }
        return loginService.login(loginForm);
    }

    /*
     * 获取userId
     */
    @RequestMapping("/user/getUserId")
    public R getUserId(HttpServletRequest request) {
        String token = request.getHeader("token");
        try {
            String userId = JwtUtil.parseJWT(token).getSubject();
            return R.ok().put("userId", userId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    /**
     * 登出
     */
    @RequestMapping("/user/logout")
    public R logout() {
        return loginService.logout();
    }

    @GetMapping("/user/getAvatar")
    public R getAvatar(HttpServletRequest request) {
        String token = request.getHeader("token");
        try {
            String userId = JwtUtil.parseJWT(token).getSubject();
            User byId = userService.getById(userId);
            String avatar = byId.getAvatar();
            return R.ok().put("userAvatar", avatar);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
