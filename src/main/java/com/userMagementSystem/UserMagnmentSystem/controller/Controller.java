package com.userMagementSystem.UserMagnmentSystem.controller;

import com.userMagementSystem.UserMagnmentSystem.model.Model;
import com.userMagementSystem.UserMagnmentSystem.service.Service_pra;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class Controller {



        @Autowired
        Service_pra service_pra;
        @PostMapping(value = "/addName")
        public String addName(@Valid @RequestBody Model model ){
            service_pra.addName(model);
            return "Name Added Succefully";



        }
        @GetMapping(value = "/getAllData")
        public List<Model> getList(){
            return Service_pra.getAllData();
        }

        @GetMapping(value = "/getAllData/{id}")
        public Model getRestarantbyID (@PathVariable int   UserId){
            return Service_pra.getDataById(UserId);
        }

        @PutMapping (value = "/update/{id}")
        public  Model update(@PathVariable int UserId, @RequestBody Model model ){
            return service_pra.update(UserId, model);
        }

        @DeleteMapping(value = "getAllData/{id}")
        public String delete(@PathVariable int id){
            Model model =Service_pra.delete(id);
            return "User deleted with ID -"+id+"with data"+model.toString();
        }
}
