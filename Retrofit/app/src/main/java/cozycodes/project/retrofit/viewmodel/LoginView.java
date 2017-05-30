package cozycodes.project.retrofit.viewmodel;

import android.databinding.BaseObservable;

/**
 * Created by Cozycodes on 5/29/2017.
 */

public class LoginView extends BaseObservable {

    private String username;
    private String password;

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


}
