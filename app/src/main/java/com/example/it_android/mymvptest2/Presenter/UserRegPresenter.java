package com.example.it_android.mymvptest2.Presenter;


import com.example.it_android.mymvptest2.Interface.MoreContract;

public class UserRegPresenter implements MoreContract.UserRegPresenter {



    private MoreContract.UserRegModel userRegModel;

    private MoreContract.View view;

    public UserRegPresenter(MoreContract.UserRegModel userRegModel, MoreContract.View view) {
        this.userRegModel = userRegModel;
        this.view = view;
    }

    @Override
    public void getData2() {
        view.showData2(userRegModel.doData2());
    }
}
