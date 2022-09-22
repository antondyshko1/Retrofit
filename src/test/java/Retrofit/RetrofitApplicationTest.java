package Retrofit;

import Retrofit.pojo.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import retrofit2.Response;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class RetrofitApplicationTest {
    APIInterface service = APIClientHelper.getClient().create(APIInterface.class);// �������������� ���������(������)
    @Test
    public void checkGetUser()throws IOException {
        Response<User>response = service.getUser().execute(); // �������� ����� ��������� � ����������, ��������� ������ � �������� �����.
        System.out.println(response.body()); // � �������� ����� ����� � ������� � �������
        Assertions.assertTrue(response.isSuccessful());
        Assertions.assertEquals(2,response.body().getData().getId());
        Assertions.assertEquals("Janet",response.body().getData().getFirstName());
        Assertions.assertEquals("Weaver",response.body().getData().getLastName());

    }
    @Test
    @DisplayName("POST - CREATE USER")
    public void CheckUserCreation()throws IOException{
        Response<CreateUserResponse> responseCreateUser = service.createUser(getRequestBody()).execute(); // �������� ���������� � ����� createUser ��������� � ���������� �������
        System.out.println(getRequestBody());

        System.out.println(responseCreateUser.body());
        Assertions.assertTrue(responseCreateUser.isSuccessful());
        Assertions.assertEquals(201, responseCreateUser.code());
        Assertions.assertEquals("morpheus",responseCreateUser.body().getName());
        Assertions.assertEquals("leader",responseCreateUser.body().getJob());
    }

    /**
     * ����� ��� �������� ���������� � ���� ������� POST
     */
    public CreateUserRequest getRequestBody(){
        CreateUserRequest requestNewUserData = new CreateUserRequest();
        requestNewUserData.setJob("leader"); // ���������� �������� ����� � POJO ������ CreateUserRequest
        requestNewUserData.setName("morpheus");
        return requestNewUserData;
    }
    @Test
    @DisplayName("GET LIST USERS")
    public void checkGetListUsers()throws IOException{
        Response<ListUsers> response = service.getListUser().execute();
        System.out.println(response.body().getData());
        List<Data> users = response.body().getData();
        users.forEach(x->Assertions.assertTrue(x.getAvatar().contains(x.getId().toString()))); // �������� ����, ��� ���� avatar �������� id
        Assertions.assertTrue(users.stream().allMatch(x->x.getEmail().endsWith("reqres.in")));//�������� ����, ��� email ������������ �� reqres.in


    }
    @Test
    @DisplayName("�������� �������� �����������")
    public void successRegTest() throws IOException {
        Response<SuccessRegResponse> response = service.successReg(getRegisterBody()).execute();
        Assertions.assertAll(
                ()->Assertions.assertTrue(response.isSuccessful()),
                ()->Assertions.assertEquals(200, response.code()),
                ()->Assertions.assertEquals(4,response.body().getId()),
                ()->Assertions.assertEquals("QpwL5tke4Pnpja7X4",response.body().getToken())
        );

    }
    /**
     * ����� ��� �������� ���������� � ���� ������� POST
     */
    public RegisterRequest getRegisterBody(){
        RegisterRequest request = new RegisterRequest();
        request.setEmail( "eve.holt@reqres.in");
        request.setPassword("pistol");
        return request;
    }
}
