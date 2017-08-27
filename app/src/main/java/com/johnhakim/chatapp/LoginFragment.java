package com.johnhakim.chatapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by johnp on 8/26/2017.
 */

public class LoginFragment extends Fragment {
    private static final  String TAG = "LoginFragment";
    private static final  int REQUEST_SIGNUP = 0;
    @BindView(R.id.input_email)EditText emailText;
    @BindView(R.id.input_password)EditText passwordText;
    @BindView(R.id.btn_login)Button loginButton;
    @BindView(R.id.link_signup)TextView signupLink;



    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);



    }


    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login,container,false);
        ButterKnife.bind(this,view);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //login();




            }
        });

        signupLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SignupFragment signupFragment = new SignupFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, signupFragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        return view;
    }



}
