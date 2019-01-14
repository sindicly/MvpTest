package com.example.it_android.mymvptest2.Model;


import com.example.it_android.mymvptest2.Interface.MoreContract;

public class UserLoginModel implements MoreContract.UserLoginModel {
    private static UserLoginModel userLoginModel;

    public static UserLoginModel getInstance() {

        if (userLoginModel == null) {
            userLoginModel = new UserLoginModel();
        }
        return userLoginModel;
    }


    @Override
    public String doData1() {
        return "hello LoginModel";
    }

    @Override
    public String doOtherDataTwo() {
        return null;
    }
}
