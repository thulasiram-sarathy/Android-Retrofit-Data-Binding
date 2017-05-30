package cozycodes.project.retrofit;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

import cozycodes.project.retrofit.interfaces.CozyApi;
import cozycodes.project.retrofit.requests.RegisterReq;
import cozycodes.project.retrofit.responses.RegisterResp;
import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;

public class DummyActivity extends AppCompatActivity  {

    private EditText editUsername, editPassword, editFirstname, editLastname;
    private Button btnRegister, btnLogin;
    private ArrayList<RegisterReq> registerList;
    private ProgressDialog pDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dummy);

    }

}
