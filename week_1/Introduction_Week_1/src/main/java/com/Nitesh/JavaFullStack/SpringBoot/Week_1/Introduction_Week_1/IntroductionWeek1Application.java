package com.Nitesh.JavaFullStack.SpringBoot.Week_1.Introduction_Week_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroductionWeek1Application implements CommandLineRunner {

	/*
	used upto 1.3 of cource

//	@Autowired  // this notify the SpringFrame that this object will Auto inject wherever needed .
//	Apple obj1;
//
//	@Autowired
//	Apple obj2;  // is created to test the Scope of a Bean

	 */

	@Autowired
	DBService dbService;

	public static void main(String[] args) {
		SpringApplication.run(IntroductionWeek1Application.class, args);


		/*
//		This is the usual method to create the obj in jave :

//		Apple obj1 = new Apple();
//		obj1.eatApple();
		*/
	}

	@Override
	public void run(String... args) throws Exception {
/*
THIS IS THE PART OF COURCE UPTO 1.3

//		obj1.eatApple();
//		obj2.eatApple();

//		System.out.println("Print the HashCode of Obj1 :" + obj1.hashCode());
//		System.out.println("Print the HashCode of Obj2 :" + obj2.hashCode());

*/

		System.out.println(dbService.getData());  // this provides output : Production data when deploy.env = Production
												  // and provide output : Development data when deploy.env = Development

													//  deploy.env   is inside  application.properties
		// we can set the enviroment variable inside edit configuration too.

	}
}
