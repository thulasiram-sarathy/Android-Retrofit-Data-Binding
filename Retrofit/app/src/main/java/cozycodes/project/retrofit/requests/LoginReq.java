package cozycodes.project.retrofit.requests;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Cozycodes on 5/26/2017.
 */

public class LoginReq {

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRes_msg() {
        return res_msg;
    }

    public void setRes_msg(String res_msg) {
        this.res_msg = res_msg;
    }

    public String getRes_code() {
        return res_code;
    }

    public void setRes_code(String res_code) {
        this.res_code = res_code;
    }

    @SerializedName("username")
    private String username;

    @SerializedName("password")
    private String password;

    @SerializedName("res_msg")
    private String res_msg;

    @SerializedName("res_code")
    private String res_code;
}
