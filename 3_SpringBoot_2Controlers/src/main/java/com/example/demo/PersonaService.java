package com.example.demo;

import java.util.List;

public interface PersonaService {
    User getUser();
    void setUserName(String name);
    void setUserCity(String city);
    void setUserAge(int age);
    void setUserID(long id);
}
