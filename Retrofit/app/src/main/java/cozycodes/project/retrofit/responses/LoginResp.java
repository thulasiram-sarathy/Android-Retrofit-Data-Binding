package cozycodes.project.retrofit.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

import cozycodes.project.retrofit.requests.LoginReq;
import cozycodes.project.retrofit.requests.RegisterReq;

/**
 * Created by Cozycodes on 5/26/2017.
 */

public class LoginResp {

    @SerializedName("data")
    @Expose
    private ArrayList<LoginReq> login = new ArrayList<>();

    public ArrayList<LoginReq> getLogin() {
        return login;
    }
}
