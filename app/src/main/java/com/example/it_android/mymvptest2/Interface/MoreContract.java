package com.example.it_android.mymvptest2.Interface;

/*
定义MVP所有接口
*/

public interface MoreContract {
    interface View {
        //显示数据

        void showData1(String str);

        void showData2(String str);

    }

    interface UserLoginPresenter {
        //通知Model获取数据，并把数据给view

        void getData1();
    }
    interface UserRegPresenter {
        //通知Model获取数据，并把数据给view

        void getData2();
    }




    interface UserLoginModel {
        //获取数据

        String doData1();

        //方法二
        String doOtherDataTwo();


    }
    interface UserRegModel {
        //获取数据

        String doData2();

    }


}
