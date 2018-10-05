package test.my.test.controller;

import org.junit.Test;
import test.my.test.entity.User;

import static org.junit.Assert.*;

public class MyRestControllerTest {

    User user =  new User("sdf",25);
    @Test
    public void saveUser() {
        boolean ssd = user.getName().contentEquals("sdf");
        assertEquals(ssd,user.getName());
    }

    @Test
    public void getName() {
    }
}