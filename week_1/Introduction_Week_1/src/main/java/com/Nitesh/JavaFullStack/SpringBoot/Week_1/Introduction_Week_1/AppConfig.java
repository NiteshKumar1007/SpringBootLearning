package com.Nitesh.JavaFullStack.SpringBoot.Week_1.Introduction_Week_1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration // this annotation is used to create our own bean and its action.
public class AppConfig {


    /*

//    Here Scope is Defult in singleton . that even if we create multiple obj it will only use one obj (bean).
//    that is when scope is in singleton and run the application the PreConstruct method and everywhere we use the object call only the single objecct will be used.

    @Autowired
	Apple obj1;

	@Autowired
	Apple obj2;

      System.out.println("Print the HashCode of Obj1 :" + obj1.hashCode());   // Output : 779057768   same for both object because inreal the framework use only one object everytimr.
		System.out.println("Print the HashCode of Obj2 :" + obj2.hashCode());   // Output :  779057768


    @Bean
    Apple getApple(){
        return new Apple();
    }

    */


    @Bean
    @Scope("prototype")
    Apple getApple() {
        return new Apple();
    }

//  System.out.println("Print the HashCode of Obj1 :" + obj1.hashCode());   // Output : 221413528      diffrent  for both object , as now framework will se mutiple object as required.
//  System.out.println("Print the HashCode of Obj2 :" + obj2.hashCode());   // Output :  274360529



}
