package com.ry.aigou.web.controller;


import com.ry.aigou.AjaxResult;
import com.ry.aigou.domain.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody User user){
        if("老王".equals(user.getUsername())&&"123".equals(user.getPassword())){
            return AjaxResult.success(user);
        }else {
            return AjaxResult.error("操作失败");
        }
    }
    @RequestMapping(value = "/login2",method = RequestMethod.GET)
    public AjaxResult login2(){
        return AjaxResult.error("操作失败");
    }
}
