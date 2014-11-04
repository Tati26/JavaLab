package entity;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tatyana on 10/29/14.
 */
public class User {

    enum role {
        ADMINISTRATOR,
        MODERATOR,
        CUSTOMER,
        GUEST
    }

    private int idUser;
    private String login;
    private String password;
    private String email;
    private int tel;
    private String address;


    public void createUser() {

    }



}
