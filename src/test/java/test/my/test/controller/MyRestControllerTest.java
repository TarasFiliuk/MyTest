package test.my.test.controller;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import test.my.test.entity.User;
import test.my.test.service.UserServiceImpl;

import static org.junit.Assert.*;

public class MyRestControllerTest {

    User ideal;



    @Before
    public void initUser() {
        this.ideal = new User("testUser", 25);
    }

    @Test
    public void getName() {

        User testUser = new User("testUser", 25);
        System.out.println(ideal.equals(testUser));
        assertEquals(ideal, testUser);
    }
}