package com.sgcc.jxd.microservicelogin.service;

import com.sgcc.jxd.microservicelogin.bean.UserInfo;
import com.sgcc.jxd.microservicelogin.repository.UserinfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserinfoRepository userinfoRepository;
    @Override
    public Map saveUesrInfo(UserInfo user) {
        Map<String,Object> map = new HashMap<>();
        UserInfo users = userinfoRepository.save(user);
           if(users !=null){
            map.put("code","200");
            return map;
        }else{
            map.put("code","201");
        }
        return map;
    }

    @Override
    public boolean removeUesrInfoById(int id) {
        return false;
    }

    @Override
    public boolean modifyUesrInfo(UserInfo user) {
        return false;
    }

    @Override
    public UserInfo getUesrInfoById(int id) {
        if(userinfoRepository.existsById(id)){
            return userinfoRepository.getOne(id);
        }else{
            return new UserInfo();
        }
    }

    @Override
    public Map loginByUserInfo(UserInfo user) {
        UserInfo userInfo = userinfoRepository.findByUsernameAndPassword(user.getUsername(),user.getPassword());
        Map<String,Object> result = new HashMap();
        if(userInfo !=null){
            result.put("code",20000);
            result.put("token", UUID.randomUUID());
        }else{
            result.put("message","登陆失败，请验证用户名密码");
        }
        return result;
    }
}
