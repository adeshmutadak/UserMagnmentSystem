package com.userMagementSystem.UserMagnmentSystem.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.logging.log4j.message.Message;
import org.hibernate.validator.constraints.Length;

import java.sql.Time;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Model {
     // @NotNull(message = "User Id Cannot be  a Null")
 //@Length(min = 2 ,max = 4 ,message = "Pls Enter a ID min 2 to Max 4")
     private int UserId ;
      @NotNull (message = "Plese Enter Something Name")
      @Size(max = 20  ,message = "Please Enter a Min 2 to Max Character ")
     @Size(min = 2 ,message = "Enter Minimum 2 Character Username")
      private String  username;

     private String  dateOfBirth;
     @Email(message = "This is not a valid Email",regexp="^[a-zA-Z0-9._-]+@[a-zA-Z0-9-]+\\.[a-zA-Z.]{2,5}")
     private String   email;
     @NotBlank(message = "Phone Number cannot be a Blank")
     @Size(min = 10 ,message = "Enter Counrty code first")
     @Size(max = 12 ,message = "Enter a Country code in fisrt then enter number")
     private  String phoneNumber;
     private String  date;
     private String time;
}
