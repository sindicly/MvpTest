package com.example.it_android.mymvptest2.View;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import com.example.it_android.mymvptest2.Interface.MoreContract;
import com.example.it_android.mymvptest2.Model.UserLoginModel;
import com.example.it_android.mymvptest2.Model.UserRegModel;
import com.example.it_android.mymvptest2.Presenter.UserLoginPresenter;
import com.example.it_android.mymvptest2.Presenter.UserRegPresenter;
import com.example.it_android.mymvptest2.R;

public class MainActivity extends AppCompatActivity implements MoreContract.View {

    private MoreContract.UserLoginPresenter presenter1;
    private MoreContract.UserRegPresenter presenter2;

    private Button btn,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        presenter1 = new UserLoginPresenter(UserLoginModel.getInstance(), this);
        presenter2 = new UserRegPresenter(UserRegModel.getInstance(), this);

        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter1.getData1();
            }
        });

        btn2= findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter2.getData2();
            }
        });
    }

    @Override
    public void showData1(String str) {
        Toast.makeText(this,str,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showData2(String str) {
        Toast.makeText(this,str,Toast.LENGTH_SHORT).show();
    }
}
