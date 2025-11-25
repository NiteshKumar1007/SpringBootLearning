package com.Nitesh.JavaFullStack.SpringBoot.Week_1.Introduction_Week_1;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty( name = "deploy.env" , havingValue = "Production")
public class ProdDb implements DB {

    public String getData(){
        return " Production Data ";
    }
}
