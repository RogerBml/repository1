package com.sgcc.pms.microservicehomepage.bean;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class HomePageMenuUtil {

    private int  menuid;
    private String menuName;
    private String parentMenuId;
    private List<HomePageMenuUtil> children = new ArrayList<>();
    public HomePageMenuUtil(){

    }
    public HomePageMenuUtil(int id,String menuName,String parentMenuId){
        this.menuid = id;
        this.menuName = menuName;
        this.parentMenuId = parentMenuId;

    }
}
