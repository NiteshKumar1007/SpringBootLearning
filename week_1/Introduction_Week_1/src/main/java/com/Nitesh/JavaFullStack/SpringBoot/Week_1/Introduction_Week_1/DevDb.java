package com.Nitesh.JavaFullStack.SpringBoot.Week_1.Introduction_Week_1;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty( name = "deploy.env" , havingValue = "Development")
public class DevDb implements DB{

    public String getData(){
        return "Development Data";
    }

}
