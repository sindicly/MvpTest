package com.example.it_android.mymvptest2.Model;


import com.example.it_android.mymvptest2.Interface.MoreContract;

public class UserRegModel implements MoreContract.UserRegModel {
    private static   UserRegModel userRegModel;
    public  static UserRegModel getInstance(){
        if(userRegModel==null){
            userRegModel=new UserRegModel();
        }
        return userRegModel;
    }

    @Override
    public String doData2() {
        return "hello RegModel";
    }
}
