package com.capgemini.lesson20.mockdemo;

public interface UserDAO {
User loadByUserNameAndPassword(String username, String password);
}
