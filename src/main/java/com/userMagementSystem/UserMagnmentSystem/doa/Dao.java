package com.userMagementSystem.UserMagnmentSystem.doa;

import com.userMagementSystem.UserMagnmentSystem.model.Model;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository

public class Dao {
    static List<Model> list=new ArrayList<>();



        public static void addName(Model model) {
            list.add(model);
        }

    public static List<Model> getAllData() {
            return list;
    }

    public static Model getAllDataById(int UserId) {
 for(Model res:list){
     if(res.getUserId()==UserId) {
         return res;
     }
 }
 return  null;
    }

    public static Model upadate(int userId, Model model) {
Model model1=getAllDataById(userId);

 model1.setUserId(model1.getUserId());
        model1.setUserId(model1.getUserId());
        model1.setUsername(model1.getUsername());
        model1.setDateOfBirth(model1.getDateOfBirth());
        model1.setEmail(model1.getEmail());
        model1.setPhoneNumber(model1.getPhoneNumber());
        model1.setDate(model1.getDate());
        model1.setTime(model1.getTime());
 return model1;
    }

    public static Model delete(int userId) {
   Model model=getAllDataById(userId);
 boolean remove=list.remove(model);
 if(remove){
return model;
 }else {
     return null;
 }
    }
}
