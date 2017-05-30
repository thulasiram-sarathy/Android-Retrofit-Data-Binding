package cozycodes.project.retrofit.viewmodel;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by Cozycodes on 5/29/2017.
 */

public class RegisterView extends BaseObservable{
    private Context mContext;
    private String username;
    private String password;
    private String firstname;
    private String lastname;

    /*public RegisterView(Context mContext) {
        this.mContext = mContext;
    }*/
    @Bindable
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Bindable
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }


}
