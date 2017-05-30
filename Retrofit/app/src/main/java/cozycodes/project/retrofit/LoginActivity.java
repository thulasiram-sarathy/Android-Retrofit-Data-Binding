package cozycodes.project.retrofit;

import android.app.ProgressDialog;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cozycodes.project.retrofit.databinding.ActivityMainBinding;
import cozycodes.project.retrofit.databinding.ActivityRegisterBinding;
import cozycodes.project.retrofit.interfaces.CozyApi;
import cozycodes.project.retrofit.requests.LoginReq;
import cozycodes.project.retrofit.requests.RegisterReq;
import cozycodes.project.retrofit.responses.LoginResp;
import cozycodes.project.retrofit.responses.RegisterResp;
import cozycodes.project.retrofit.viewmodel.LoginView;
import cozycodes.project.retrofit.viewmodel.RegisterView;
import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;

public class LoginActivity extends AppCompatActivity {

//    private EditText editUsername, editPassword, editFirstname, editLastname;
//    private Button btnRegister, btnLogin;
    private ArrayList<LoginReq> loginList;
    private ProgressDialog pDialog;
    ActivityMainBinding binding;

/*    @BindView(R.id.editUsername)
    EditText editUsername;

    @BindView(R.id.editPassword)
    EditText editPassword;*/

    @BindView(R.id.btnRegister)
    Button btnRegister;

    @BindView(R.id.btnLogin)
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.setLogin(new LoginView());
        ButterKnife.bind(this);

       /* editUsername = (EditText) findViewById(R.id.editUsername);
        editPassword = (EditText) findViewById(R.id.editPassword);
        btnRegister = (Button) findViewById(R.id.btnRegister);
        btnRegister.setOnClickListener(this);

        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(this);  */

        loginList = new ArrayList<>();

    }

/*    @Override
    public void onClick(View view) {

       if(view == btnRegister){
           finish();

       }
        else if(view == btnLogin){
           userLogin();
       }
    }*/

    @OnClick({R.id.btnRegister, R.id.btnLogin})
    public void onClick(Button v) {
        if (v.getId() == R.id.btnRegister) {
            finish();
        } else if (v.getId() == R.id.btnLogin) {
            userLogin();
        }

    }

    private void userLogin(){
//        openDialogBox();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.1.37/retrofit/").
                        addConverterFactory(GsonConverterFactory.create())
                .build();

        CozyApi apiService = retrofit.create(CozyApi.class);
        LoginReq login = new LoginReq();

        login.setUsername(binding.getLogin().getUsername());
        login.setPassword(binding.getLogin().getPassword());

        Call<LoginResp> loginRespCall = apiService.setLoginDetails(login.getUsername(), login.getPassword());

        loginRespCall.enqueue(new Callback<LoginResp>() {
            @Override
            public void onResponse(Response<LoginResp> response, Retrofit retrofit) {
                if(response.isSuccess()){
                    loginList = response.body().getLogin();


                    for (int i = 0; i < loginList.size(); i++) {
                        String res_msg = loginList.get(i).getRes_msg();
                        String res_code =loginList.get(i).getRes_code();

                        Log.i("msg", "Response message: " + res_msg);
                        Toast.makeText(LoginActivity.this, res_msg, Toast.LENGTH_SHORT).show();
                        if(res_msg.equals("login success")){
                            Intent startDummy = new Intent(getApplicationContext(), DummyActivity.class);
                            startActivity(startDummy);
                        }
                    }
                }
            }

            @Override
            public void onFailure(Throwable t) {
                Log.d("onFailure", t.toString());
                Toast.makeText(LoginActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
            }
        });

    }

}
