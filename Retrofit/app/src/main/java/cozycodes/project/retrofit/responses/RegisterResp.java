package cozycodes.project.retrofit.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

import cozycodes.project.retrofit.requests.RegisterReq;

/**
 * Created by Cozycodes on 5/26/2017.
 */

public class RegisterResp {

    @SerializedName("data")
    @Expose
    private ArrayList<RegisterReq> register = new ArrayList<>();

    public ArrayList<RegisterReq> getRegister() {
        return register;
    }
}
