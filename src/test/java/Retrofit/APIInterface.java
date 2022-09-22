package Retrofit;

import Retrofit.pojo.*;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface APIInterface {
    @GET("/api/users/2")
    Call<User> getUser();

    @GET("/api/users?page=2")
    Call<ListUsers> getListUser();
    @POST("/api/users")
    Call<CreateUserResponse>createUser(@Body CreateUserRequest body); // ���������� ���� �������. CreateUserResponse pojo ����� � �������, CreateUserRequest pojo ����� � ������ ��� �������� �� �����.

    @POST("/api/register")
    Call<SuccessRegResponse>successReg(@Body RegisterRequest body);
}
