package com.userMagementSystem.UserMagnmentSystem.service;

import com.userMagementSystem.UserMagnmentSystem.doa.Dao;
import com.userMagementSystem.UserMagnmentSystem.model.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Service_pra
{
    @Autowired
    Dao dao;

    public static List<Model> getAllData() {
        return Dao.getAllData();
    }

    public static Model getDataById(int UserId) {
        return Dao.getAllDataById(UserId);
    }

    public static Model delete(int UserId) {
        return Dao.delete(UserId);
    }

    public void addName(Model model) {
         Dao.addName(model);

    }

    public static Model update(int UserId, Model model) {
        return Dao.upadate(UserId,model);
    }
}
