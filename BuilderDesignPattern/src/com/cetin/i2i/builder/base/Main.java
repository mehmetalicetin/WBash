package com.cetin.i2i.builder.base;

import com.cetin.i2i.builder.bean.Email;

public class Main {

  public static void main(String[] args) {
    
    Email email=new Email.EmailBuilder()
                         .addRecipient("malicetin@gmail.com")
                         .setMainText("Hello Builder Desing Patten")
                         .setGreeting("Hi Ali")
                         .setClosing("Regards")
                         .setTitle("Builder Pattern Recources")
                         .build();
   System.out.println("son commit 9:20 V1");
  }

}
