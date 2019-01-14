package com.example.it_android.mymvptest2.Presenter;


import com.example.it_android.mymvptest2.Interface.MoreContract;

public class UserLoginPresenter implements MoreContract.UserLoginPresenter {

    private MoreContract.UserLoginModel userLoginModel;

    private MoreContract.View view;

    public UserLoginPresenter(MoreContract.UserLoginModel userLoginModel, MoreContract.View view) {
        this.userLoginModel = userLoginModel;
        this.view = view;
    }


    @Override
    public void getData1() {
        view.showData1(userLoginModel.doData1());
    }
}
