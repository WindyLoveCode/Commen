package com.bjx.com.commen.Activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.bjx.com.commen.R;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.CheckedChange;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Fullscreen;
import org.androidannotations.annotations.ViewById;
/**我很性感，但是我不浪*/
@Fullscreen
@EActivity(R.layout.activity_login)
public class LoginActivity extends Activity {
    @ViewById(R.id.scrollView_login)
    ScrollView scrollView;
    @ViewById(R.id.edit_login_mobile)
    EditText edit_mobile;//用户名
    @ViewById(R.id.edit_login_password)
    EditText edit_password;//密码
    @ViewById(R.id.img_login_cleanU)
    ImageView img_cleanU;//用户名清空
    @ViewById(R.id.img_login_cleanP)
    ImageView img_cleanP;//密码清空
    @ViewById(R.id.img_login_show)
    ImageView img_show;//显示密码
    @ViewById(R.id.check_login_password)
    CheckBox check_password;//记住密码
    @ViewById(R.id.btn_login_go)
    Button btn_login;//显示密码
    @ViewById(R.id.text_login_regist)
    TextView text_regist;//用户注册
    @ViewById(R.id.text_login_forget)
    TextView text_forget;//忘记密码


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @AfterViews
    void init(){
        Toast.makeText(LoginActivity.this,"Hello",Toast.LENGTH_SHORT).show();
    }
    /**登录*/
    @Click(R.id.btn_login_go)
    void click_login(){

    }
    /**注册*/
    @Click(R.id.text_login_regist)
    void click_regist(){

    }
    /**忘记密码*/
    @Click(R.id.text_login_forget)
    void click_forget(){

    }
    /**清空用户名*/
    @Click(R.id.img_login_cleanU)
    void click_cleanU(){

    }
    /**清空密码*/
    @Click(R.id.img_login_cleanP)
    void click_cleanP(){

    }
    /**显示密码*/
    @Click(R.id.img_login_show)
    void click_show(){

    }
    @CheckedChange(R.id.check_login_password)
    void check_password(CompoundButton hello, boolean isChecked){

    }
}
