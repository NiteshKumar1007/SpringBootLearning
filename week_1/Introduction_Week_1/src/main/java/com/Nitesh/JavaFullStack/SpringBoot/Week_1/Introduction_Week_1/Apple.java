package com.Nitesh.JavaFullStack.SpringBoot.Week_1.Introduction_Week_1;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


// we cooment out this becuse we created our own Bean in AppConfig Class.
//@Component    // this notify the spring frame=work that this class will work as Bean(object) now

// below all this are sterotype annotation which implement @component and used to specify or difreentiate the beans.
//@Service
//@Repository

public class
Apple {

    void eatApple(){
        System.out.println("I am Eating An Apple .");
    }

    @PostConstruct  // this will run after the Bean is initialized and Before is being used by Application ( 3rd Stage of Bean Cycle )
    void callBeforeAppleUse(){
        System.out.println("Creating the Apple Before use ");
    }

    @PreDestroy  // this will run , when the Bean(object) is not used or when apllication closed. ( 5th stage of Bean Cycle )
    void callAfterUsed(){
        System.out.println("The Use of Apple Finished ");
    }
}
