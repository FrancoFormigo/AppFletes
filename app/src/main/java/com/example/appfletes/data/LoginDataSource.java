package com.example.appfletes.data;

import com.example.appfletes.data.model.LoggedInUser;

import java.io.IOException;

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
public class LoginDataSource {

    public Result<LoggedInUser> login(String username, String password) {

        try {
            // TODO: handle loggedInUser authentication
            if(username.equals("usuario") && password.equals("123456")){
                LoggedInUser fakeUser =
                        new LoggedInUser(java.util.UUID.randomUUID().toString(), "Usuario");
                return new Result.Success<>(fakeUser);
            } else {
                return null;
            }
        } catch (Exception e) {
            return new Result.Error(new IOException("Ingreso fallido", e));
        }

    }

    public void logout() {
        // TODO: revoke authentication
    }
}