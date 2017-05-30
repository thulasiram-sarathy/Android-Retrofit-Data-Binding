package cozycodes.project.retrofit.interfaces;

import cozycodes.project.retrofit.responses.LoginResp;
import cozycodes.project.retrofit.responses.RegisterResp;
import retrofit.Call;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

/**
 * Created by Cozycodes on 5/26/2017.
 */

public interface CozyApi {

    @FormUrlEncoded
    @POST("api/register.php")
    Call<RegisterResp> setRegistrationDetails(
            @Field("username") String username,
            @Field("password") String password,
            @Field("firstname") String firstname,
            @Field("lastname") String lastname);


    @FormUrlEncoded
    @POST("api/login.php")
    Call<LoginResp> setLoginDetails(
            @Field("username") String username,
            @Field("password") String password
    );

}
