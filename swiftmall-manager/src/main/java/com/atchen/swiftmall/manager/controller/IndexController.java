package com.atchen.swiftmall.manager.controller;


import com.atchen.swiftmall.manager.service.SysMenuService;
import com.atchen.swiftmall.manager.service.SysUserService;
import com.atchen.swiftmall.manager.service.ValidateCodeService;
import com.atchen.swiftmall.model.dto.system.LoginDto;
import com.atchen.swiftmall.model.vo.common.Result;
import com.atchen.swiftmall.model.vo.common.ResultCodeEnum;
import com.atchen.swiftmall.model.vo.system.LoginVo;
import com.atchen.swiftmall.model.vo.system.SysMenuVo;
import com.atchen.swiftmall.model.vo.system.ValidateCodeVo;
import com.atchen.swiftmall.utils.AuthContextUtil;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "User interface")
@RestController
@RequestMapping(value = "/admin/system/index")
public class IndexController {

    @Autowired
    private SysUserService sysUserService;

    @Autowired
    private ValidateCodeService validateCodeService;

    @Autowired
    private SysMenuService sysMenuService;

    // Query the menus that the user can operate on
    @GetMapping("/menus")
    public Result menus() {
        List<SysMenuVo> list = sysMenuService.findMenusByUserId();
        return Result.build(list, ResultCodeEnum.SUCCESS);
    }

    //User logout
    @GetMapping(value = "/logout")
    public Result logout(@RequestHeader(name = "token") String token) {
        sysUserService.logout(token);
        return Result.build(null, ResultCodeEnum.SUCCESS);

    }

    //Retrieve current user login information
//    @GetMapping(value = "/getUserInfo")
//    public Result getUserInfo(@RequestHeader(name = "token") String token) {
//        //1 Retrieve token from request header
////        another method:
////        Use(HttpServletRequest request) String token = request.getHeader("token");
//
//        //2 Retrieve user information from Redis based on the token
//        SysUser sysUser = sysUserService.getUserInfo(token);
//
//        //3 Return user info
//        return Result.build(sysUser, ResultCodeEnum.SUCCESS);
//    }
    @GetMapping(value = "/getUserInfo")
    public Result getUserInfo() {
        return Result.build(AuthContextUtil.get(), ResultCodeEnum.SUCCESS);
    }

    //Image CAPTCHA
    @GetMapping(value = "/generateValidateCode")
    public Result<ValidateCodeVo> generateValidateCode() {
        ValidateCodeVo validateCodeVo = validateCodeService.generateValidateCode();
        return Result.build(validateCodeVo, ResultCodeEnum.SUCCESS);
    }

    // User Login
    @Operation(summary = "login method") //reminder
    @PostMapping("login")
    public Result login(@RequestBody LoginDto loginDto) {
        LoginVo loginVo = sysUserService.login(loginDto);
        return Result.build(loginVo, ResultCodeEnum.SUCCESS);
    }
}
